package io.communet.springct;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/4/26
 * <p>Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
    }

}
