package io.communet.springct.controller;

import io.communet.springct.feign.TestDemoApi;
import io.communet.springct.feign.ComputeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
  @Autowired
  private ComputeApi computeApi;
  @Autowired
  private TestDemoApi testDemoApi;

  @RequestMapping(value = "/test/feign" , method = RequestMethod.GET)
  public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
    return computeApi.add(a,b);
  }

  @RequestMapping(value = "/test/test" , method = RequestMethod.GET)
  public String testDemo() {
    return testDemoApi.demoTest();
  }
}