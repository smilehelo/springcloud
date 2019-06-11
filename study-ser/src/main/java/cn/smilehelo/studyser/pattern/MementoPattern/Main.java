package cn.smilehelo.studyser.pattern.MementoPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-06-11 23:56
 **/
public class Main {

    public static void main(String[] args) {
        Origintor origintor = new Origintor("测试","1");
        Caretaker caretaker = new Caretaker();
        caretaker.memento = origintor.createMemento();
        System.out.println(origintor);
        origintor.status = "haha";
        origintor.type = "222";
        System.out.println(origintor);
        origintor.restoreMemento(caretaker.memento);
        System.out.println(origintor);
    }
}
