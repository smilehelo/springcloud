package cn.smilehelo.studyser.pattern.FactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 01:16
 **/
public class AudiCarFactory implements CarFactory {
    @Override
    public Car bulidCar() {
        return new AudiCar();
    }
}
