package cn.smilehelo.studyser.pattern.AbstractFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-22 00:14
 **/
public class Main {

    public static void main(String[] args) throws Exception{
        Car car = EasyFactory.getCar();
        Plane plane = EasyFactory.getPlane();
        car.drive();
        plane.fly();
    }
}
