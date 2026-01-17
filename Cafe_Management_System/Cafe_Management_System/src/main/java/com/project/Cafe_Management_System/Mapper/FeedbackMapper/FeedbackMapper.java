package com.project.Cafe_Management_System.Mapper.FeedbackMapper;

import com.project.Cafe_Management_System.Dto.FeedbackDto.FeedbackDto;
import com.project.Cafe_Management_System.Dto.FeedbackDto.FeedbackResponesDto;
import com.project.Cafe_Management_System.Entity.CustomerEntity.Customer;
import com.project.Cafe_Management_System.Entity.FeedbackEntity.Feedback;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FeedbackMapper {
    public static List<FeedbackResponesDto> feedback_Get(List<Feedback> feedback){
        return feedback.stream().map(FeedbackMapper::to_Dto).collect(Collectors.toList());
    }

    public static Feedback to_Entity(FeedbackDto feedbackDto, Customer customer){
        Feedback feedback=new Feedback();
        feedback.setCustomer(customer);
        feedback.setFeedback_text(feedbackDto.getFeedback_text());
        feedback.setCreated_at(LocalDateTime.now());
        return feedback;
    }
    public static FeedbackResponesDto to_Dto(Feedback feedback){
        FeedbackResponesDto feedbackResponesDto=new FeedbackResponesDto();
        feedbackResponesDto.setCustomer_id(feedback.getCustomer().getCustomer_id());
        feedbackResponesDto.setFeedback_text(feedback.getFeedback_text());
        return feedbackResponesDto;
    }
    public static void feedback_put(Feedback feedback,FeedbackDto feedbackDto){
        if(feedbackDto.getFeedback_text()!=null){
            feedback.setFeedback_text(feedbackDto.getFeedback_text());
        }
    }
}