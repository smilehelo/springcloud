package cn.smilehelo.studyser.service;

import cn.smilehelo.studyser.entity.TestEntity;

import java.util.List;

/**
 * @program: springcloud
 * @description: JpaTest
 * @author: HeLO
 * @create: 2018-12-02 23:21
 **/
public interface JpaTestService {

    List<TestEntity> findByExample(String name);
}
