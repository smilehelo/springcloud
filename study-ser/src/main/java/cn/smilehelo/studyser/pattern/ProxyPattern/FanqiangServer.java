package cn.smilehelo.studyser.pattern.ProxyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-18 00:00
 **/
public class FanqiangServer implements Internet {

    @Override
    public String goInternet() {
        System.out.println("这里是翻墙服务器！");
        return "上Google";
    }
}
