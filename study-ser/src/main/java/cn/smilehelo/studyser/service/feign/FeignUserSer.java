package cn.smilehelo.studyser.service.feign;

import cn.smilehelo.studyser.service.hystrix.HytrixUserSer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud
 * @description: 服务内部调用user-ser
 * @author: HeLO
 * @create: 2018-08-12 16:12
 **/
@FeignClient(value = "user-ser", fallback = HytrixUserSer.class)
public interface FeignUserSer {

    /**
     * @Description: 测试方法
     * @Param:
     * @return:
     * @Author: HeLO
     * @Date: 2018/8/12
     */
    @RequestMapping("info")
    String info();
}
