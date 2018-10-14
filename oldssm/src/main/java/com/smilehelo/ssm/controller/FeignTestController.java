package com.smilehelo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springcloud
 * @description: feign测试
 * @author: HeLO
 * @create: 2018-10-14 22:50
 **/
@Controller
@RequestMapping("feign")
public class FeignTestController {

    @RequestMapping("string")
    public String string(){
        System.out.println("进入string方法");
        return "index";
    }


    @RequestMapping("json")
    @ResponseBody
    public Object json(){
        System.out.println("进入json方法");
        Map<String,String> map = new HashMap<>();
        map.put("result","success");
        map.put("msg","hahaha");
        map.put("data","heheheh");
        return map;
    }

}
