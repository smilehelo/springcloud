package cn.smilehelo.studyser.pattern.AdapterPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-29 00:23
 **/
public class Usber implements Usb {
    @Override
    public void connect() {
        System.out.println("使用USB接口连接");
    }
}
