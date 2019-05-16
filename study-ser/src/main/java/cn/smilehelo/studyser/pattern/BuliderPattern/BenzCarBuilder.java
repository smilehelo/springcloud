package cn.smilehelo.studyser.pattern.BuliderPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:43
 **/
public class BenzCarBuilder extends CarBuilder{
    @Override
    void buildPartA() {
        car.setPartA("BenzPartA");
    }

    @Override
    void buildPartB() {
        car.setPartB("BenzPartB");
    }
}
