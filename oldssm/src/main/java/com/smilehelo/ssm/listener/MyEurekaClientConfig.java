package com.smilehelo.ssm.listener;

import com.netflix.discovery.DefaultEurekaClientConfig;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springcloud
 * @description: 自定义eureka设置
 * @author: HeLO
 * @create: 2018-10-09 23:49
 **/
public class MyEurekaClientConfig extends DefaultEurekaClientConfig {


    /** 
    * @Description: 地区，默认即可
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/10/10 
    */ 
    @Override
    public String getRegion() {
        return "default";
    }

    /** 
    * @Description: 获取地区，默认即可 
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/10/10 
    */ 
    @Override
    public String[] getAvailabilityZones(String region) {
        return new String[]{"defaultZone"};
    }

    /** 
    * @Description: eureka的注册地址
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/10/10 
    */ 
    @Override
    public List<String> getEurekaServerServiceUrls(String myZone) {
        String serviceUrl = "http://test:test@localhost:8761/eureka/";
        List<String> urls = new ArrayList<>();
        urls.add(serviceUrl);
        return urls;
    }
}
