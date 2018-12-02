package cn.smilehelo.studyser.controller;

import cn.smilehelo.studyser.dao.TestDao;
import cn.smilehelo.studyser.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-11-27 01:16
 **/
@RestController
@RequestMapping("jpa")
public class JpaTestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping("save")
    public void save(){
        TestEntity test = new TestEntity();
        test.setName("今晚测试");
        test.setAge(22);
        test.setRemark("测试JPA");
        testDao.save(test);
    }

    @RequestMapping("findAll")
    public List<TestEntity> findAll(){
        return testDao.findAll();
    }
}
