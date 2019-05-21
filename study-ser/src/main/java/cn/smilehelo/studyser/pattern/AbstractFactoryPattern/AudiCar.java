package cn.smilehelo.studyser.pattern.AbstractFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-22 00:02
 **/
public class AudiCar implements Car {
    @Override
    public void drive() {
        System.out.println("Audi Car drive");
    }
}
