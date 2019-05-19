package cn.smilehelo.studyser.pattern.ObserverPattern;

/**
 * @program: springcloud
 * @description: 发布消息者，被观察者
 * @author: HeLO
 * @create: 2019-05-20 00:01
 **/
public interface Subject {

    void addObserver(ObServer obServer);

    void removeObserver(ObServer obServer);

    void notifyObserver(String message);
}
