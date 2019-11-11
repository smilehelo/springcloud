package cn.smilehelo.studyser;

import cn.smilehelo.studyser.dao.TestDao;
import cn.smilehelo.studyser.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class StudySerApplicationTests {

    @Autowired
    private TestDao testDao;


    
    public void test() {
        TestEntity entity = new TestEntity();
        entity.setName("20181218");
        entity.setAge(123);
        entity.setRemark("hahaha");
        testDao.save(entity);
    }

}
