package sut.hxl.dubbodemo.clientservice.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stu.hxl.dubbodemo.api.IOrderService;

/**
 * @author sharloon
 * @date 2019/9/4
 */
@RestController
public class TestController {

    @Reference(loadbalance = "random", mock = "sut.hxl.dubbodemo.clientservice.mock.OrderServiceMock", timeout = 1, cluster = "failfast")
    private IOrderService orderService;

    @GetMapping("/test")
    public String test(@RequestParam String no) {

        System.out.println("test success ~");

        return orderService.queryOrder(no);
    }

}
