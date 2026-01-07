package com.project.Cafe_Management_System.Service.OrderService.OrderServiceIml;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;
import com.project.Cafe_Management_System.Entity.CategoryEntity.Category;
import com.project.Cafe_Management_System.Entity.OrderEntity.Order;
import com.project.Cafe_Management_System.Entity.UserEntity.User;
import com.project.Cafe_Management_System.Mapper.OrderMapper.OrderMapper;
import com.project.Cafe_Management_System.Repository.OrderRepository.OrderRepository;
import com.project.Cafe_Management_System.Repository.UserRepository.UserRepository;
import com.project.Cafe_Management_System.Service.OrderService.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<OrderResponesDto> order_Get(){
        List<Order> order=orderRepository.findAll();
        return OrderMapper.order_Get(order);
    }
    public OrderResponesDto order_Post(OrderDto orderDto){
        User user=userRepository.findById(orderDto.getUser_id()).orElseThrow(()->new RuntimeException("User Not Found"));
        Order order=OrderMapper.to_Entity(orderDto,user);
        Order order_Saved=orderRepository.save(order);
        return OrderMapper.to_Dto(order_Saved);
    }
    public String order_Put(Integer id,OrderDto orderDto){
        User user=userRepository.findById(orderDto.getUser_id()).orElseThrow(()->new RuntimeException("User Not Found"));
        Order order=orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order Not Found"));
            order.setCreate_at(order.getCreate_at());
            OrderMapper.to_Entity_Put(orderDto,user,order);
            orderRepository.save(order);
            return id+"Update Successfully";
    }
    public String order_Delete(Integer id){
        Order order=orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order Not Found"));
        orderRepository.deleteById(id);
        return id+"Order Delete Successfully";
    }
}