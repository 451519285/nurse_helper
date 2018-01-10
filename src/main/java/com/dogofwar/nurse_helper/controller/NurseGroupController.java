package com.dogofwar.nurse_helper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/nurse/group")
public class NurseGroupController {

    @RequestMapping(value = "/myGroup")
    @ResponseBody
    public Map<String, String> myGroup(@RequestParam Map<String,Object> params) {
        Map<String,String> map = new HashMap<>();
        map.put("key","123");
        return map;
    }
}
