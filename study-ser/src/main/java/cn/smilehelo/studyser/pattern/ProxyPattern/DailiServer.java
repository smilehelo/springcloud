package cn.smilehelo.studyser.pattern.ProxyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-17 23:59
 **/
public class DailiServer implements Internet {

    Internet internet = new FanqiangServer();
    @Override
    public String goInternet() {
        return internet.goInternet();
    }
}
