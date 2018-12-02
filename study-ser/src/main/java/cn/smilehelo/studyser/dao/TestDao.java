package cn.smilehelo.studyser.dao;

import cn.smilehelo.studyser.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springcloud
 * @description: 测试jpa
 * @author: HeLO
 * @create: 2018-11-27 00:40
 **/
public interface TestDao extends JpaRepository<TestEntity, Long> {


    List<TestEntity> findByName(String name);




}
