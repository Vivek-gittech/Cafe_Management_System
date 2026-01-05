package com.project.Cafe_Management_System.Service.OrderService;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;

public interface OrderService {
    OrderResponesDto order_Post(OrderDto orderDto);
}
