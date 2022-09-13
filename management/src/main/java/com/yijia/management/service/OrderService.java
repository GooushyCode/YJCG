package com.yijia.management.service;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.mapper.OrderMapper;
import com.yijia.management.vo.Order;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;
    // 查询所有配件
    public ServerResponse<List<Order>> findAll(){
        List<Order> all = orderMapper.findAll();
        return ServerResponse.createBySuccess("查询成功！",all);
    }
}
