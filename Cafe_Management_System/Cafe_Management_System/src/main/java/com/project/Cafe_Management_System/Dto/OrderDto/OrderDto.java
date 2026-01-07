package com.project.Cafe_Management_System.Dto.OrderDto;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;



public class OrderDto {
    private Integer order_id;
    private Integer user_id;
    private Integer table_number;
    private String order_status;
    private Double total_amount;
    private LocalDateTime create_at;
    private LocalDateTime update_at;


    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setTable_number(Integer table_number) {
        this.table_number = table_number;
    }

    public Integer getTable_number() {
        return table_number;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }
}