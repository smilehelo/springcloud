package cn.smilehelo.studyser.pattern.DecoratorPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:53
 **/
public class Egg implements Food{

    Food food;

    public Egg(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return food.price() + 1;
    }

    @Override
    public String desc() {
        return food.desc() + " 鸡蛋";
    }
}
