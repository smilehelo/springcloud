package cn.smilehelo.studyser.pattern.MementoPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-06-11 23:43
 **/
public class Memento {

    private String status;

    private String type;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Memento(String status, String type) {
        this.status = status;
        this.type = type;
    }

    public Memento() {
    }
}
