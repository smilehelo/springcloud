package cn.smilehelo.studyser.pattern.AdapterPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-29 00:24
 **/
public class Main {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.connect();
    }
}
