package com.project.Cafe_Management_System.Dto.OrderDto;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class OrderDto {
    private int order_id;
    private int user_id;
    private int table_number;
    private String order_status;
    private double total_number;
    private LocalDateTime create_at;
    private LocalDateTime update_at;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTable_number() {
        return table_number;
    }

    public void setTable_number(int table_number) {
        this.table_number = table_number;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public double getTotal_number() {
        return total_number;
    }

    public void setTotal_number(double total_number) {
        this.total_number = total_number;
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
