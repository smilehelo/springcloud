package cn.smilehelo.studyser.pattern.AbstractFactoryPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-22 00:05
 **/
public class EasyFactory {

    public static Car getCar() throws Exception {
        String className = AbstractConfig.PACKAGE_NAME + AbstractConfig.CAR_NAME + "Car";
        return (Car)Class.forName(className).newInstance();
    }

    public static Plane getPlane() throws Exception {
        String className = AbstractConfig.PACKAGE_NAME + AbstractConfig.PALNE_NAME + "Plane";
        return (Plane)Class.forName(className).newInstance();
    }


}
