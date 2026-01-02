package com.project.Cafe_Management_System.Service.UserService.UserServiceIml;

import com.project.Cafe_Management_System.Dto.UserDto.UserDto;
import com.project.Cafe_Management_System.Dto.UserDto.UserResponesDto;
import com.project.Cafe_Management_System.Entity.RoleEntity.Role;
import com.project.Cafe_Management_System.Entity.UserEntity.User;
import com.project.Cafe_Management_System.Mapper.UserMapper.UserMapper;
import com.project.Cafe_Management_System.Repository.RoleRepository.RoleRepository;
import com.project.Cafe_Management_System.Repository.UserRepository.UserRepository;
import com.project.Cafe_Management_System.Service.UserService.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleRepository roleRepository;

    public UserServiceIml(UserRepository userRepository, UserMapper userMapper,RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.roleRepository=roleRepository;
    }

    @Override

    public List<UserResponesDto> get_Data(){
        List<User> users=userRepository.findAll();
        return UserMapper.get_toDto(users);
    }
    public UserResponesDto user_Post_Data(UserDto userDto){
        Role role=roleRepository.findById(userDto.getRole_id()).orElseThrow(()-> new RuntimeException("Role Not Found"));

        User user=UserMapper.toEntity(userDto,role);
        user=userRepository.save(user);
        return UserMapper.toDto(user);
    }
    public UserResponesDto put_Data(Integer id,UserDto userDto){

        User user=userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
        if (userDto.getRole_id() != null) {
            Role role = roleRepository.findById(userDto.getRole_id())
                    .orElseThrow(() -> new RuntimeException("Role Not Found"));
            user.setRole(role);
        }
        UserMapper.toUpdate(userDto,user);
        User userSaved=userRepository.save(user);
        return UserMapper.toDto(userSaved);
    }
    public String user_Delete(Integer id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "Delete The Record Successfully: "+id;
        }
        return "User Id Not Found";
    }
}
