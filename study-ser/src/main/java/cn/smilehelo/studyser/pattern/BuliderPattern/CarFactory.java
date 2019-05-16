package cn.smilehelo.studyser.pattern.BuliderPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:45
 **/
public class CarFactory {

    CarBuilder carBuilder;

    public CarFactory(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar(){
        carBuilder.buildPartA();
        carBuilder.buildPartB();
        return carBuilder.getCar();
    }
}
