package io.communet.springct.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/10/18
 * <p>Version: 1.0
 */
@FeignClient(name = "compute-service")
public interface ComputeApi {

    @RequestMapping("/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) ;
}
