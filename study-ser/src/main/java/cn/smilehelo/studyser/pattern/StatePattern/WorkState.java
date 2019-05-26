package cn.smilehelo.studyser.pattern.StatePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-26 23:59
 **/
public class WorkState implements State {
    @Override
    public void handle() {
        System.out.println("working");
    }
}
