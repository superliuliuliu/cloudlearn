package xin.liugaoyang.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description 测试Eureka客户端controller
 * @date 2020/7/8 14:54
 */
@Slf4j
@RestController
public class TestEurekaClientController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    /**
     * doTest
     * @description 测试接口 测试程序能否运行
     * @param id 用户输入的id
     * @return {@link String}
     * @author liugaoyang
     * @date 2020/7/8 15:04
     * @version 1.0.0
     */
    @RequestMapping("/test/info")
    public String doTest(@RequestParam(value = "id") Integer id){
        StringBuilder stringBuilder = new StringBuilder("Hello world Spring cloud! Your id is:").append(id);
        log.info("The request port is:{}", httpServletRequest.getServerPort());
        return stringBuilder.toString();
    }
}
