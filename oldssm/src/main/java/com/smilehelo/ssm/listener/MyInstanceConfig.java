package com.smilehelo.ssm.listener;

import com.netflix.appinfo.MyDataCenterInstanceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Set;


/** 
* @Description: 自定义的注册信息
* @Param:  
* @return:  
* @Author: HeLO
* @Date: 2018/10/10 
*/
public class MyInstanceConfig extends MyDataCenterInstanceConfig {


    /**
     * 优先使用ip 替换 hostname
     * @param refresh
     * @return
     */
    @Override
    public String getHostName(boolean refresh) {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return super.getHostName(refresh);
        }
    }


    /***
     *获取本机启动中tomcat端口号
     * @return
     */
    @Override
    public int getNonSecurePort(){
        int tomcatPort;
        try {
            MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
            Set<ObjectName> objectNames = beanServer.queryNames(new ObjectName("*:type=Connector,*"),
                    Query.match(Query.attr("protocol"), Query.value("HTTP/1.1")));

            tomcatPort = Integer.valueOf(objectNames.iterator().next().getKeyProperty("port"));
        }catch (Exception e){
            return super.getNonSecurePort();
        }
        return tomcatPort;
    }

    /**
    * @Description: 注册名称
    * @Param:
    * @return:
    * @Author: HeLO
    * @Date: 2018/10/10
    */
    @Override
    public String getAppname(){
        return "oldssm";
    }

    /** 
    * @Description: vipaddrss地址
    * @Param:  
    * @return:  
    * @Author: HeLO
    * @Date: 2018/10/14
    */ 
    @Override
    public String getVirtualHostName(){
        return "oldssm";
    }


    @Override
    public String getInstanceId(){
        return getHostName(true) + ":" + getNonSecurePort();
    }
}
