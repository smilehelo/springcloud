package cn.smilehelo.studyser.pattern.StrategyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:22
 **/
public class BenzCar implements Car {
    @Override
    public String drive() {
        return "Benz";
    }
}
