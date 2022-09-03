package com.basudev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basudev.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
