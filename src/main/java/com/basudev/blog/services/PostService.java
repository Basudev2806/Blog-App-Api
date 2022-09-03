package com.basudev.blog.services;

import java.util.List;

import com.basudev.blog.payloads.PostDto;
import com.basudev.blog.payloads.PostResponse;

public interface PostService {
	
	//Create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete
	
	void deletePost(Integer postId);
	
	//Get-All Post
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//Get-Single Post
	
	PostDto getPostById(Integer postId);
	
	//Get-All Post By Category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//Get-All Post By User
	
	List<PostDto> getPostsByUser(Integer userId);
	
	//Search Posts
	
	List<PostDto> searchPosts(String keyword);

}
