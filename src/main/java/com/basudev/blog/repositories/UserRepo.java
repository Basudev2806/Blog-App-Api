package com.basudev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basudev.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
