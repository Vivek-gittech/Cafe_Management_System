package com.project.Cafe_Management_System.Controller.OrderController;

import com.project.Cafe_Management_System.Dto.OrderDto.OrderDto;
import com.project.Cafe_Management_System.Dto.OrderDto.OrderResponesDto;
import com.project.Cafe_Management_System.Service.OrderService.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //Get All Order
    @GetMapping("/Get")
    public List<OrderResponesDto> order_Get(){
        return orderService.order_Get();
    }

    //Insert New Record Order
    @PostMapping("/Post")
    public OrderResponesDto order_Post(@RequestBody OrderDto orderDto) {
        return orderService.order_Post(orderDto);
    }


    //Update The Order using id
    @PutMapping("/Update/{id}")
    public String order_Put(@PathVariable Integer id,@RequestBody OrderDto orderDto){
        return orderService.order_Put(id,orderDto);
    }

    //Delete Order Using id
    @DeleteMapping("/Delete/{id}")
    public String order_Delete(@PathVariable Integer id){
        return orderService.order_Delete(id);
    }
}