package cn.smilehelo.studyser.pattern.AbstractFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-22 00:03
 **/
public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("Benz Car drive");
    }
}
