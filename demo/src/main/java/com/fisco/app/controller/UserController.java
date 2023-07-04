package com.fisco.app.controller;


import com.fisco.app.Service.UserService;
import com.fisco.app.common.R;
import com.fisco.app.entity.User;
import com.fisco.app.vo.ReqAddUser;
import com.fisco.app.vo.ReqNull;
import com.fisco.app.vo.ResAddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/game")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public R addUser(@RequestBody ReqAddUser req) {
        ResAddUser result = userService.addUser(req);
        return R.ok(result);
    }

    @GetMapping("/user/list")
    public R queryUserList(@RequestParam(required = false, name = "name") ReqNull req) {
        List<User> list = userService.list();
        return R.ok(list);
    }

}
