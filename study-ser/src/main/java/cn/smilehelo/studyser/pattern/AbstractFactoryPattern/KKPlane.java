package cn.smilehelo.studyser.pattern.AbstractFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-22 00:04
 **/
public class KKPlane implements Plane {
    @Override
    public void fly() {
        System.out.println("空客飞机飞");
    }
}
