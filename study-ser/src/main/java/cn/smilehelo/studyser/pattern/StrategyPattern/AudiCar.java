package cn.smilehelo.studyser.pattern.StrategyPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:21
 **/
public class AudiCar implements Car {
    @Override
    public String drive() {
        return "Audi";
    }
}
