package com.yijia.management.mapper;

import com.yijia.management.vo.Order;
import com.yijia.management.vo.Parts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    List<Order> findAll();
}
