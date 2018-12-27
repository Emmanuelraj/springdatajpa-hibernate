package com.demo.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springjpa.entity.UserDTO;

public interface UserJpaRepository extends JpaRepository<UserDTO, Long> 
{
	List<UserDTO> findById(int id);
}
