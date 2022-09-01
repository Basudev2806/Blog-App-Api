package com.basudev.blog.services;

import java.util.List;

import com.basudev.blog.entities.Post;
import com.basudev.blog.payloads.PostDto;

public interface PostService {
	
	//Create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update
	
	Post updatePost(PostDto postDto, Integer postId);
	
	//Delete
	
	void deletePost(Integer postId);
	
	//Get-All Post
	
	List<Post> getAllPost();
	
	//Get-Single Post
	
	Post getPostById(Integer postId);
	
	//Get-All Post By Category
	
	List<Post> getPostsByCategory(Integer categoryId);
	
	//Get-All Post By User
	
	List<Post> getPostsByUser(Integer userId);

}
