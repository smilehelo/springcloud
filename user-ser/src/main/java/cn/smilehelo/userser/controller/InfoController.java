package cn.smilehelo.userser.controller;

import cn.smilehelo.userser.service.feign.FeignStudtSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: info
 * @author: HeLO
 * @create: 2018-08-10 01:15
 **/
@RestController
public class InfoController {

    @Autowired
    private FeignStudtSer feignStudtSer;

    /** 
    * @Description: info
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/8/10 
    */
    @RequestMapping("info")
    public String info(){
        return "hello user service!!";
    }


    @RequestMapping("feignTest")
    public String feignTest(){
        return "hello user service " + feignStudtSer.info();
    }


}
