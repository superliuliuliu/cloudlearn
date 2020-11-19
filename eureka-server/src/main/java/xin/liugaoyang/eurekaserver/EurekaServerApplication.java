package xin.liugaoyang.eurekaserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;


@EnableEurekaServer /*服务注册中心*/
@SpringBootApplication
@Slf4j
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaServerApplication.class);
		Environment env = app.run(args).getEnvironment();

		log.info("启动成功！");
		log.info("Eureka Server地址：http:127.0.0.1:{}", env.getProperty("server.port"));
	}

}
