package cn.smilehelo.studyser.pattern.BridgePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-07-10 00:21
 **/
public class Main {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.setName("Iphone X");
        mobile.setMobileSystem(new IosSystem());
        mobile.mobileInfo();


    }
}
