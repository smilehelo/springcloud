package cn.smilehelo.service;

import cn.smilehelo.studyser.StudySerApplication;
import cn.smilehelo.studyser.dao.TestDao;
import cn.smilehelo.studyser.entity.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springcloud
 * @description: 测试
 * @author: HeLO
 * @create: 2018-11-27 00:42
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEntityService {

    @Autowired
    private TestDao testDao;




}
