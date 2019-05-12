package cn.smilehelo.studyser.pattern.factoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-12 23:23
 **/
public class CarFactory {

    public static Car buildCar(String name){
        switch (name) {
            case "Audi":
                return new AudiCar();
            case "Benz":
                return new BenzCar();
            case "Bmw":
                return new BmwCar();
            default:
                return new BikeCar();
        }
    }
}
