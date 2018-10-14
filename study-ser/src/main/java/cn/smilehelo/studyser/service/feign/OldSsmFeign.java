package cn.smilehelo.studyser.service.feign;

import cn.smilehelo.studyser.common.ResultEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2018-10-14 22:54
 **/
@FeignClient("oldssm")
public interface OldSsmFeign {

    @RequestMapping("feign/string")
    String string();


    @RequestMapping(value = "feign/json",consumes = MediaType.APPLICATION_JSON_VALUE)
    ResultEntity json();
}
