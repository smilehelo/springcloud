package cn.smilehelo.studyser.pattern.ProxyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-18 00:02
 **/
public class Main {

    public static void main(String[] args) {
        DailiServer dailiServer = new DailiServer();
        System.out.println(dailiServer.goInternet());
    }
}
