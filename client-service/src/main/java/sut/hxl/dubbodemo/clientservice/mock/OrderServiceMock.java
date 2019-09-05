package sut.hxl.dubbodemo.clientservice.mock;

import stu.hxl.dubbodemo.api.IOrderService;

/**
 * @author sharloon
 * @date 2019/9/4
 */
public class OrderServiceMock implements IOrderService {

    @Override
    public String queryOrder(String no) {
        return "sorry, 服务器异常， 触发mock机制降级~";
    }
}
