package cn.smilehelo.studyser.common;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-03-27 00:18
 **/
@Component
public class ExecutorTest {

    @Bean
    public ThreadPoolTaskExecutor test(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(100);
        return threadPoolTaskExecutor;
    }



}
