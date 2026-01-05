package com.project.Cafe_Management_System.Dto.OrderDto;

import org.springframework.stereotype.Component;

@Component
public class OrderResponesDto {

    private int table_number;
    private String order_status;
    private double total_amount;

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

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}
