package cn.smilehelo.studyser.service.Impl;

import cn.smilehelo.studyser.dao.TestDao;
import cn.smilehelo.studyser.entity.TestEntity;
import cn.smilehelo.studyser.service.JpaTestService;
import org.hibernate.resource.transaction.backend.jta.internal.synchronization.ExceptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-12-02 23:23
 **/
@Service
public class JpaTestServiceImpl implements JpaTestService {

    @Autowired
    private TestDao testDao;


    @Override
    public List<TestEntity> findByExample(String name) {
        List<TestEntity> list = testDao.findByName(name);
        return list;
    }
}
