package cn.smilehelo.studyser.pattern.SmileFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:28
 **/
public class Main {

    public static void main(String[] args) {
        Car car = CarFactory.buildCar("aaa");
        car.drive();
    }
}
