package cn.smilehelo.studyser.pattern.FactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 01:15
 **/
public class BenzCarFactory implements CarFactory {
    @Override
    public Car bulidCar() {
        return new BenzCar();
    }
}
