package xin.liugaoyang.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description 测试客户端负载均衡器Ribbon Service
 * @date 2020/7/8 19:27
 */
@Service
public class TestRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    // 测试调用/test/info接口的返回内容
    public String testRibbon(Integer id){
        return restTemplate.getForObject("http://CLOUDLEARN-EUREKA-CLIENT1/test/info?id=" + id, String.class);
    }

}
