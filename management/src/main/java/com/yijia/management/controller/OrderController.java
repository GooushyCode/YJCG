package com.yijia.management.controller;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.service.OrderService;
import com.yijia.management.vo.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;
    //查询所有配件
    @RequestMapping("/findAll")
    public ServerResponse<List<Order>> getAll(){
        ServerResponse<List<Order>> response = orderService.findAll();
        return response;
    }
}
