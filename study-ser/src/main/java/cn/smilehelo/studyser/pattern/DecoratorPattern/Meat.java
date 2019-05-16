package cn.smilehelo.studyser.pattern.DecoratorPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:56
 **/
public class Meat implements Food {
    Food food;

    public Meat(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return food.price() + 2;
    }

    @Override
    public String desc() {
        return food.desc() + " 肉";
    }
}
