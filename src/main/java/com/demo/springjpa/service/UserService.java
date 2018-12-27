package com.demo.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springjpa.entity.UserDTO;
import com.demo.springjpa.repository.UserJpaRepository;

@Service
public class UserService {

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired
    UserJpaRepository userJpaRepository;
	
	
	public List<UserDTO> saveData(UserDTO user) 
	{
		 this.userJpaRepository.save(user);
		 
		 return this.userJpaRepository.findAll();
	}


	public List<UserDTO> findById(int id) {
		// TODO Auto-generated method stub
		return this.userJpaRepository.findById(id);
	}
	
	
	
	public List<UserDTO> getAll()
	{
		return this.userJpaRepository.findAll();
	}
	
	public UserDTO saveUser(UserDTO user)
	{
		return this.userJpaRepository.save(user);
	}
	

}
