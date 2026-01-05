package com.project.Cafe_Management_System.Mapper.OrderMapper;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;
import com.project.Cafe_Management_System.Entity.OrderEntity.Order;
import com.project.Cafe_Management_System.Entity.UserEntity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OrderMapper {

    public static Order to_Entity(OrderDto orderDto, User user){
        Order order=new Order();
        order.setTable_number(orderDto.getTable_number());
        order.setTotal_amount(orderDto.getTotal_number());
        order.setOrder_status(orderDto.getOrder_status());
        order.setUser(user);
        order.setCreate_at(LocalDateTime.now());
        order.setUpdate_at(LocalDateTime.now());
        return order;
    }
    public static OrderResponesDto to_Dto(Order order){
        OrderResponesDto orderResponesDto=new OrderResponesDto();
        orderResponesDto.setOrder_status(order.getOrder_status());
        orderResponesDto.setTable_number(order.getTable_number());
        orderResponesDto.setTotal_amount(order.getTotal_amount());
        return orderResponesDto;
    }
}
