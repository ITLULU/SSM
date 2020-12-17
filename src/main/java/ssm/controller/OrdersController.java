package ssm.controller;

import ssm.pojo.Orders;
import ssm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {
    /**
     * 向订单查询页面跳转
     */
    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser( ) {
        return "orders";
    }
}
