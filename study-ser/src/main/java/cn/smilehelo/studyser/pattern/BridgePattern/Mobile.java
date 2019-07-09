package cn.smilehelo.studyser.pattern.BridgePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-07-10 00:15
 **/
public class Mobile {

    private String name;

    private MobileSystem mobileSystem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MobileSystem getMobileSystem() {
        return mobileSystem;
    }

    public void setMobileSystem(MobileSystem mobileSystem) {
        this.mobileSystem = mobileSystem;
    }

    public void mobileInfo() {
        String systemInfo = mobileSystem.info();
        System.out.println("mobileName=" + name + ",systemInfo=" + systemInfo);
    }

}
