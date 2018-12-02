package cn.smilehelo.studyser.controller;

import cn.smilehelo.studyser.service.feign.UserSerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: info
 * @author: HeLO
 * @create: 2018-08-12 16:06
 **/
@RestController
@RefreshScope
public class InfoController {

    @Autowired
    private UserSerFeign userSerFeign;
    //从配置中心获取
    @Value("${name}")
    private String testName;
    @Value("${password}")
    private String testPassword;

    /** 
    * @Description: 测试信息 
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/8/12 
    */ 
    @RequestMapping("info")
    public String info() {
        return "hello study service!!";
    }

    /** 
    * @Description: 测试feign及hystrix功能
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/8/12 
    */ 
    @RequestMapping("feignTest")
    public String feignTest() {
        return "hello study service " + userSerFeign.info();
    }


    /**
     * @Description: 测试配置中心
     * @Param:
     * @return:
     * @Author: HeLO
     * @Date: 2018/8/12
     */
    @RequestMapping("configTest")
    public String configTest(){
        return testName + testPassword;
    }


}
