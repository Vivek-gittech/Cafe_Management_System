package com.project.Cafe_Management_System.Service.UserService;

import com.project.Cafe_Management_System.Dto.UserDto.UserDto;
import com.project.Cafe_Management_System.Dto.UserDto.UserResponesDto;

import java.util.List;

public interface UserService {

    List<UserResponesDto> get_Data();
    UserResponesDto user_Post_Data(UserDto userDto);
    UserResponesDto put_Data(Integer id,UserDto userDto);
    String user_Delete(Integer id);
}