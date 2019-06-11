package cn.smilehelo.studyser.pattern.MementoPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-06-11 23:46
 **/
public class Origintor {

    String status;

    String type;

    public Origintor(String status, String type) {
        this.status = status;
        this.type = type;
    }

    public Origintor() {}

    public Memento createMemento(){
        return new Memento(status,type);
    }

    public void restoreMemento(Memento memento){
        this.status = memento.getStatus();
        this.type = memento.getType();
    }

    @Override
    public String toString() {
        return "Origintor{" +
                "status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
