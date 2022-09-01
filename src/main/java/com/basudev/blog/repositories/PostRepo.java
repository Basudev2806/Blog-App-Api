package com.basudev.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basudev.blog.entities.Category;
import com.basudev.blog.entities.Post;
import com.basudev.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
