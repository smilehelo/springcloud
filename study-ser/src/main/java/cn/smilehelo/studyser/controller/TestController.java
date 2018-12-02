package cn.smilehelo.studyser.controller;

import cn.smilehelo.studyser.service.feign.OldSsmFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-10-14 23:02
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private OldSsmFeign oldSsmFeign;

    @RequestMapping("string")
    public String string(){
        String value = oldSsmFeign.string();
        System.out.println(value);
        return value;
    }


    @RequestMapping("json")
    public String json(){
        return oldSsmFeign.json().toString();
    }
}
