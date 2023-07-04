package com.fisco.app.controller;

import com.fisco.app.Service.AdminService;
import com.fisco.app.common.R;
import com.fisco.app.entity.Admin;
import com.fisco.app.enums.RespEnum;
import com.fisco.app.vo.ReqLoginVo;
import com.fisco.app.vo.ResLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/game")
@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public R login(@RequestBody ReqLoginVo reqLoginVo) {
        Admin result = adminService.login(reqLoginVo);
        if(result == null) {
            return R.error(RespEnum.LOGIN_FAIL);
        }
        ResLoginVo resLoginVo = new ResLoginVo();
        resLoginVo.setName(result.getName());
        resLoginVo.setId(result.getId());
        return R.ok(result);
    }
}
