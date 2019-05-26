package cn.smilehelo.studyser.pattern.StatePattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-26 23:59
 **/
public class Context {

    public Context(State state) {
        this.state = state;
    }

    private State state = new SleepState();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doRunung() {
        state.handle();
        state = new SleepState();
    }

    public void doWork(){
        state.handle();
        state = new RunState();
    }

    public void doSleep(){
        state.handle();
        state = new WorkState();
    }


}
