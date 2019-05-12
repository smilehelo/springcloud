package cn.smilehelo.studyser.pattern.StrategyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:30
 **/
public class BikeCar implements Car {
    @Override
    public String drive() {
        return "Bike";
    }
}
