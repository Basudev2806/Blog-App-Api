package com.basudev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basudev.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
