package com.project.Cafe_Management_System.Entity.FeedbackEntity;

import com.project.Cafe_Management_System.Entity.CustomerEntity.Customer;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name="Feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedback_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
    private String feedback_text;
    private LocalDateTime created_at;


    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFeedback_text() {
        return feedback_text;
    }

    public void setFeedback_text(String feedback_text) {
        this.feedback_text = feedback_text;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
