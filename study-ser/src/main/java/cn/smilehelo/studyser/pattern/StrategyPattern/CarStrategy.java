package cn.smilehelo.studyser.pattern.StrategyPattern;


/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:33
 **/
public class CarStrategy {

    Car car;

    public CarStrategy(Car car) {
        this.car = car;
    }

    public void driveCar(){
        System.out.println("司机上车了！" + car.drive());
    }
}
