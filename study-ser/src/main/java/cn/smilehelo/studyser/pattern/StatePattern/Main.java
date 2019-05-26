package cn.smilehelo.studyser.pattern.StatePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-27 00:26
 **/
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new SleepState());
        context.doSleep();
        context.doWork();
        context.doRunung();
    }
}
