package cn.smilehelo.studyser.pattern.BuliderPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:46
 **/
public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new AudiCarBuilder();
        CarFactory carFactory = new CarFactory(carBuilder);
        Car car = carFactory.buildCar();
        System.out.println(car.getPartA() + car.getPartB());
    }
}
