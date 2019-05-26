package cn.smilehelo.studyser.pattern.StatePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-26 23:58
 **/
public class SleepState implements State {
    @Override
    public void handle() {
        System.out.println("Sleeping");
    }
}
