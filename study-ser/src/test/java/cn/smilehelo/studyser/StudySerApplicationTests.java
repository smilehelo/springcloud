package cn.smilehelo.studyser;

import cn.smilehelo.studyser.dao.TestDao;
import cn.smilehelo.studyser.entity.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudySerApplicationTests {

    @Autowired
    private TestDao testDao;

    @Test
    public void test() {
        TestEntity entity = new TestEntity();
        entity.setName("20181218");
        entity.setAge(123);
        entity.setRemark("hahaha");
        testDao.save(entity);
    }

}
