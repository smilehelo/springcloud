package com.smilehelo.ssm.listener;

import com.netflix.discovery.DefaultEurekaClientConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springcloud
 * @description: 自定义eureka设置
 * @author: HeLO
 * @create: 2018-10-09 23:49
 **/
public class MyEurekaClientConfig extends DefaultEurekaClientConfig {

    @Override
    public String getRegion() {
        return "default";
    }

    @Override
    public String getRegistryRefreshSingleVipAddress() {
        return "oldssm";
    }

    public String[] getAvailabilityZones(String region) {
        return new String[]{"default"};
    }

    @Override
    public List<String> getEurekaServerServiceUrls(String myZone) {
        String serviceUrl = "http://test:test@localhost:8761/eureka/";
        List<String> urls = new ArrayList<>();
        urls.add(serviceUrl);
        return urls;
    }
}
