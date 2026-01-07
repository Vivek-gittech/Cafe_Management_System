package com.project.Cafe_Management_System.Service.OrderService;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;

import java.util.List;

public interface OrderService {

    List<OrderResponesDto> order_Get();
    OrderResponesDto order_Post(OrderDto orderDto);
    String order_Put(Integer id,OrderDto orderDto);
    String order_Delete(Integer id);
}
