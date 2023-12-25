package com.springtechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtechie.model.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
    // marker interface

	
}
