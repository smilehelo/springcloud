package cn.smilehelo.userser.service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud
 * @description: 内部服务调用study-ser
 * @author: HeLO
 * @create: 2018-08-12 16:17
 **/
@FeignClient("study-ser")
public interface StudtSerFeign {

    @RequestMapping("info")
    String info();
}
