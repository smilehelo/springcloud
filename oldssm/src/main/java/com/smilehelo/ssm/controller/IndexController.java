package com.smilehelo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-10-08 23:25
 **/
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("test")
    public void test(){
        System.out.println("进入方法！！");
        System.out.println("hahahahah");
    }
}
