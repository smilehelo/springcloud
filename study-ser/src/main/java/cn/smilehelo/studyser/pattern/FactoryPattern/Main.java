package cn.smilehelo.studyser.pattern.FactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 01:14
 **/
public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new AudiCarFactory();
        Car car = carFactory.bulidCar();
        car.drive();
    }
}
