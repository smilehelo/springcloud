package cn.smilehelo.studyser.pattern.DecoratorPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:52
 **/
public class Shouzhuabing implements Food{

    @Override
    public int price() {
        return 6;
    }

    @Override
    public String desc() {
        return "手抓饼";
    }
}
