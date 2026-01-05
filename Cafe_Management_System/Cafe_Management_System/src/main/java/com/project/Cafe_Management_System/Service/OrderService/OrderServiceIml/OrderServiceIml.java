package com.project.Cafe_Management_System.Service.OrderService.OrderServiceIml;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;
import com.project.Cafe_Management_System.Entity.OrderEntity.Order;
import com.project.Cafe_Management_System.Entity.UserEntity.User;
import com.project.Cafe_Management_System.Mapper.OrderMapper.OrderMapper;
import com.project.Cafe_Management_System.Repository.OrderRepository.OrderRepository;
import com.project.Cafe_Management_System.Repository.UserRepository.UserRepository;
import com.project.Cafe_Management_System.Service.OrderService.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceIml implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final UserRepository userRepository;


    public OrderServiceIml(OrderRepository orderRepository, OrderMapper orderMapper, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.userRepository = userRepository;
    }

    @Override
    public OrderResponesDto order_Post(OrderDto orderDto){
        System.out.println("User Id" + orderDto.getUser_id());
        User user=userRepository.findById(orderDto.getUser_id()).orElseThrow(()->new RuntimeException("User Not Found"));
        Order order=OrderMapper.to_Entity(orderDto,user);
        Order order_Saved=orderRepository.save(order);
        return OrderMapper.to_Dto(order);
    }
}
