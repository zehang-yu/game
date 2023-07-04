package com.fisco.app.Service;

import com.fisco.app.utils.PageUtils;
import com.fisco.app.vo.ReqAddUser;
import com.fisco.app.vo.ResAddUser;

import java.util.Map;

public interface UserService {

    PageUtils queryPage(Map<String, Object> params);

    ResAddUser addUser(ReqAddUser req);


}
