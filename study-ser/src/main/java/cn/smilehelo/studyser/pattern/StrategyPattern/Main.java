package cn.smilehelo.studyser.pattern.StrategyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:39
 **/
public class Main {

    public static void main(String[] args) {
        Car car = new AudiCar();
        CarStrategy carStrategy = new CarStrategy(car);
        carStrategy.driveCar();
    }
}
