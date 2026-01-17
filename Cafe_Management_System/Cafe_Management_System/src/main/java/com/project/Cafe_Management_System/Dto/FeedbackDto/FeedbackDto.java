package com.project.Cafe_Management_System.Dto.FeedbackDto;

import java.time.LocalDateTime;

public class FeedbackDto {
    private int customer_id;
    private String feedback_text;
    private LocalDateTime created_at;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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
