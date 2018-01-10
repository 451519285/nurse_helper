package com.dogofwar.nurse_helper.controller;

import com.dogofwar.model.BaseUser;
import com.dogofwar.nurse_helper.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/nurse/user")
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;

    @RequestMapping("/allUser")
    @ResponseBody
    public List<BaseUser> allUser() {
        List<BaseUser> allUser = baseUserService.getAllUser();
        return allUser;
    }
}
