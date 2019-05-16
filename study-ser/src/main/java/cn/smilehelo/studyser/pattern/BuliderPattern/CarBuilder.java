package cn.smilehelo.studyser.pattern.BuliderPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:41
 **/
public abstract class CarBuilder {

    Car car = new Car();

    abstract void buildPartA();

    abstract void buildPartB();

    Car getCar(){
        return car;
    }
}
