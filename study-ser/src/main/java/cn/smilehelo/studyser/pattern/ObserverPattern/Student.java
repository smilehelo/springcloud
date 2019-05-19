package cn.smilehelo.studyser.pattern.ObserverPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-20 00:03
 **/
public class Student implements ObServer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("学生：" + name + "接到了老师发布任务：" + message);
    }
}
