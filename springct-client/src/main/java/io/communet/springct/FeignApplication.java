package io.communet.springct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"io.communet.springct.feign"})
@EnableDiscoveryClient
public class FeignApplication {
  public static void main(String[] args) {
	  
    SpringApplication.run(FeignApplication.class, args);
  }
}