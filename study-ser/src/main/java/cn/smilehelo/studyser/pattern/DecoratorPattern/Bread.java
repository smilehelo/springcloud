package cn.smilehelo.studyser.pattern.DecoratorPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:51
 **/
public class Bread implements Food {
    @Override
    public int price() {
        return 5;
    }

    @Override
    public String desc() {
        return "面包";
    }
}
