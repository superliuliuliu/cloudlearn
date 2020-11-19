package xin.liugaoyang.serviceribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServiceRibbonApplication.class);
        Environment env = app.run(args).getEnvironment();

        log.info("启动成功！");
        log.info("RIBBON Client地址：http:127.0.0.1:{}", env.getProperty("server.port"));
    }

    /**
     *
     * @description 整合Ribbon以实现负载均衡
     * @author liugaoyang
     * @date 2020/7/8 16:52
     * @version 1.0.0
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
