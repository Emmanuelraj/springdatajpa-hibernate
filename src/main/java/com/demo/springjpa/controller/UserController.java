package com.demo.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org


.springframework.web.bind.annotation.RestController;

import com.demo.springjpa.entity.UserDTO;
import com.demo.springjpa.service.UserService;

@RestController
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public List<UserDTO> saveData(@RequestBody final UserDTO user)
	{
		
	 return userService.saveData(user);
		
	   
	}
	

	@GetMapping("/{id}")
	public List<UserDTO>  findById(@PathVariable("id") int id)
	{
		System.out.println("hi"+id);
		
	    return userService.findById(id);
	}
	
	
	
	
	
	@GetMapping("/update/{id}/{name}")
	public UserDTO updateUserById(@PathVariable("id") int id,@PathVariable("name")String name)
	{
		List<UserDTO> user = 	findById(id);
	    
		 UserDTO  userDTO = new UserDTO();
		
		 userDTO.setName(name);
		
		 
		
	   return userService.saveUser(userDTO);
	}
	
	
	
	
	
	
	@GetMapping("/all")
	public List<UserDTO> findAll()
	{
		  return userService.getAll();
	}
	
	
   }
