package cn.smilehelo.studyser.service.hystrix;

import cn.smilehelo.studyser.service.feign.FeignUserSer;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @description: user-ser断路器
 * @author: HeLO
 * @create: 2018-08-12 16:45
 **/
@Component
public class HytrixUserSer implements FeignUserSer {

    @Override
    public String info() {
        return "sorry!! this is Hystrix return!!";
    }
}
