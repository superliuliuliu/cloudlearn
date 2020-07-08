package xin.liugaoyang.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xin.liugaoyang.serviceribbon.service.TestRibbonService;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description 测试负载均衡的controller
 * @date 2020/7/8 19:33
 */
@RestController
public class TestRibbonController {

    @Autowired
    private TestRibbonService ribbonService;

    @GetMapping("/test")
    public String doTestRibbon(@RequestParam(value = "id") Integer id){
        return ribbonService.testRibbon(id);
    }

}
