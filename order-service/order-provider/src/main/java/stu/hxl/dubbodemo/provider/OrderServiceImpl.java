package stu.hxl.dubbodemo.provider;

import org.apache.dubbo.config.annotation.Service;
import stu.hxl.dubbodemo.api.IOrderService;

/**
 * @author sharloon
 * @date 2019/9/4
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Override
    public String queryOrder(String no) {
        return "订单查询成功，订单号为：" + no;
    }
}
