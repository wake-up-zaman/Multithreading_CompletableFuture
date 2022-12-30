package com.example.completableFuture.repository;


import com.example.completableFuture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
