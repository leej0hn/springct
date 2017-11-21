package io.communet.springct.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/10/18
 * <p>Version: 1.0
 */
@FeignClient(url = "${demo.url}", name = "demoapi")
public interface TestDemoApi {

    @RequestMapping(value = "/api/test" , method = RequestMethod.GET)
    String demoTest();
}
