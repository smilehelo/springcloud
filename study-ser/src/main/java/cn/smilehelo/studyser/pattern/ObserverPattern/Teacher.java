package cn.smilehelo.studyser.pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-20 00:04
 **/
public class Teacher implements Subject {
    private List<ObServer> obServerList = new ArrayList<>();

    @Override
    public void addObserver(ObServer obServer) {
        obServerList.add(obServer);
    }

    @Override
    public void removeObserver(ObServer obServer) {
        obServerList.remove(obServer);
    }

    @Override
    public void notifyObserver(String message) {
        for(ObServer obServer : obServerList){
            obServer.update(message);
        }
    }
}
