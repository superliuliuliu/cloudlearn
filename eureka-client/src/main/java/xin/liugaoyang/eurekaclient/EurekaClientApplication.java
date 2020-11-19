package xin.liugaoyang.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaClientApplication.class);
        Environment env = app.run(args).getEnvironment();

        log.info("启动成功！");
        log.info("Eureka Client地址：http:127.0.0.1:{}", env.getProperty("server.port"));
    }

}
