package com.project.Cafe_Management_System.Dto.FeedbackDto;

public class FeedbackResponesDto {
    private int customer_id;
    private String feedback_text;

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
}