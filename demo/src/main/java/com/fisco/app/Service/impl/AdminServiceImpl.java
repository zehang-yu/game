package com.fisco.app.Service.impl;

import com.fisco.app.DAO.AdminDao;
import com.fisco.app.Service.AdminService;
import com.fisco.app.entity.Admin;
import com.fisco.app.vo.ReqLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
   @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(ReqLoginVo reqLoginVo) {
        Admin result = adminDao.selectAdmin(reqLoginVo.getName(), reqLoginVo.getPassword());
        return result;
    }
}
