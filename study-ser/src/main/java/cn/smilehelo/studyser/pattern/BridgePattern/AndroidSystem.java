package cn.smilehelo.studyser.pattern.BridgePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-07-10 00:21
 **/
public class AndroidSystem implements MobileSystem {

    @Override
    public String info() {
        return "Android System";
    }
}
