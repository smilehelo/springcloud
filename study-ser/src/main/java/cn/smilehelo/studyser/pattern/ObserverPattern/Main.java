package cn.smilehelo.studyser.pattern.ObserverPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-20 00:08
 **/
public class Main {

    public static void main(String[] args) {
        Subject teacher = new Teacher();
        ObServer xiaohong =  new Student("小红");
        ObServer xiaoming = new Student("小明");
        ObServer xiaowang = new Student("小王");
        teacher.addObserver(xiaohong);
        teacher.addObserver(xiaoming);
        teacher.addObserver(xiaowang);
        teacher.notifyObserver("上课了，回座位坐好！");
        teacher.removeObserver(xiaohong);
        teacher.notifyObserver("下课了，回家玩吧！");

    }
}
