package cn.smilehelo.studyser.pattern.BridgePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-07-10 00:19
 **/
public class IosSystem implements MobileSystem {
    @Override
    public String info() {
        return "Ios System";
    }
}
