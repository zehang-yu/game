package com.fisco.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/alpha")
public class DemoController {

    @PostMapping("/demo")
    @ResponseBody
    public String demo() {
        return "test";
    }

}
