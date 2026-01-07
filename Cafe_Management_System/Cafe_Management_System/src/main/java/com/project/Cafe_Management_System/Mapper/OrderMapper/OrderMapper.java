package com.project.Cafe_Management_System.Mapper.OrderMapper;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;
import com.project.Cafe_Management_System.Entity.OrderEntity.Order;
import com.project.Cafe_Management_System.Entity.UserEntity.User;
import com.project.Cafe_Management_System.Mapper.Menu_itemMapper.Menu_itemMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    public static List<OrderResponesDto> order_Get(List<Order> order){
        return order.stream()
                .map(OrderMapper::to_Dto)
                .collect(Collectors.toList());
    }
    public static Order to_Entity(OrderDto orderDto, User user){
        Order order=new Order();
        order.setTable_number(orderDto.getTable_number());
        order.setTotal_amount(orderDto.getTotal_amount());
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
    public static void to_Entity_Put(OrderDto orderDto,User user,Order order){
        if(orderDto.getUser_id()!=null){
            order.setUser(user);
        }
        if(orderDto.getOrder_status()!=null){
            order.setOrder_status(orderDto.getOrder_status());
        }
        if(orderDto.getTotal_amount()!=null){
            order.setTotal_amount(orderDto.getTotal_amount());
        }
        if(orderDto.getTable_number()!=null){
            order.setTable_number(orderDto.getTable_number());
        }
        order.setUpdate_at(LocalDateTime.now());
    }
}
