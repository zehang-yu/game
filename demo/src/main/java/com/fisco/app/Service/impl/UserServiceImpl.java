package com.fisco.app.Service.impl;

import com.fisco.app.DAO.UserDao;
import com.fisco.app.Service.UserService;
import com.fisco.app.common.GlobalConstant;
import com.fisco.app.common.Query;
import com.fisco.app.entity.User;
import com.fisco.app.enums.BuyEnum;
import com.fisco.app.utils.PageUtils;
import com.fisco.app.vo.ReqAddUser;
import com.fisco.app.vo.ResAddUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.webank.webase.app.sdk.client.AppClient;
import com.webank.webase.app.sdk.config.HttpConfig;
import com.webank.webase.app.sdk.dto.req.ReqNewUser;
import com.webank.webase.app.sdk.dto.rsp.RspUserInfo;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Value("${webase.node.mgr.url}")
    private String url;

    @Value("${webase.node.mgr.appKey}")
    private String appKey;

    @Value("${webase.node.mgr.appSecret}")
    private String appSecret;

    @Value("${webase.node.mgr.isTransferEncrypt}")
    private Boolean isTransferEncrypt;

    @Autowired
    private UserDao userDAO;

    private static AppClient appClient = null;

    private static final String ACCOUNT = "admin";

    private static final String CONTRACT_VERSION = "1.0.0";

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<User> page = this.page(
//                new Query<User>().getPage(params),
//                new QueryWrapper<User>()
//        );
//
//        return new PageUtils(page);
//    }


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }

    @Override
    public ResAddUser addUser(ReqAddUser req) {
        // 1.先落地user表
        String username = req.getUsername();
        User user = new User();
        BeanUtils.copyProperties(req, user);


        // 2.调用WeBASE-APP-SDK 获取用户公钥地址等信息
        ReqNewUser reqNewUser = new ReqNewUser();
        reqNewUser.setGroupId(1);
        reqNewUser.setUserName(user.getUsername());
        reqNewUser.setAccount(ACCOUNT);
        reqNewUser.setDescription(GlobalConstant.APP_PREIX + username);
        HttpConfig httpConfig = new HttpConfig(30, 30, 30);
        appClient = new AppClient(url, appKey, appSecret, isTransferEncrypt, httpConfig);
        RspUserInfo resp = appClient.newUser(reqNewUser);
        String address = resp.getAddress();
        String signUserId = resp.getSignUserId();
        String privateKey = resp.getPrivateKey();
        user.setSignUserId(signUserId);
        user.setPublicAddress(address);
        user.setPrivateKey(privateKey);

        user.setStatus(BuyEnum.NEW_USER.getCode());
        userDAO.insertUser(user.getId(),user.getUsername(),user.getSignUserId(),user.getPublicAddress(),user.getPrivateKey(),user.getStatus());
        ResAddUser res = new ResAddUser();
        res.setTxHash(req.getUsername() + "添加成功");
        return res;
    }







}

