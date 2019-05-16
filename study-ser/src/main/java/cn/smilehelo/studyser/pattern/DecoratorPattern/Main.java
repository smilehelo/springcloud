package cn.smilehelo.studyser.pattern.DecoratorPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-16 23:57
 **/
public class Main {

    public static void main(String[] args) {
        Food food = new Bread();
        food = new Egg(food);
        food = new Meat(food);
        System.out.println(food.price() + "  " + food.desc());
    }
}
