package cn.smilehelo.studyser.pattern.factoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:22
 **/
public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("Benz Car drive!!");
    }
}
