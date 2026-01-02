package com.project.Cafe_Management_System.Repository.CustomerRepository;
import com.project.Cafe_Management_System.Entity.CustomerEntity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}