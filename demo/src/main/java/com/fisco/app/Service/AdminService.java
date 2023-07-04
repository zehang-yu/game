package com.fisco.app.Service;

import com.fisco.app.DAO.AdminDao;
import com.fisco.app.entity.Admin;
import com.fisco.app.vo.ReqLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface AdminService {
    Admin login(ReqLoginVo reqLoginVo);
}
