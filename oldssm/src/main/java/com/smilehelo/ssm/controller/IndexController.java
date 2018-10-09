package com.smilehelo.ssm.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryManager;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-10-08 23:25
 **/
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    public void hello(){
        System.out.println("hello oldssm!!!");
    }


    @RequestMapping("test")
    public void test(){
        EurekaClient eurekaClient = DiscoveryManager.getInstance().getEurekaClient();
        Applications applications = eurekaClient.getApplications();
        List<InstanceInfo> list =  applications.getInstancesBySecureVirtualHostName("study-ser");
        InstanceInfo one = list.get(0);
        System.out.println("获取学习服务地址信息为：" + one.getIPAddr() + ":" + one.getPort());

    }
}
