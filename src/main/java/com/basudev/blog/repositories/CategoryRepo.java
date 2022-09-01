package com.basudev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basudev.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
