package com.project.Cafe_Management_System.Repository.UserRepository;

import com.project.Cafe_Management_System.Entity.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
