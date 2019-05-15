package cn.smilehelo.studyser.pattern.FactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:22
 **/
public class BmwCar implements Car {
    @Override
    public void drive() {
        System.out.println("Bmw Car drive!!");
    }
}
