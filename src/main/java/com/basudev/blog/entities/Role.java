package com.basudev.blog.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Role {
	
	
	@Id
	private int id;
	
	private String name;
	
	

}
