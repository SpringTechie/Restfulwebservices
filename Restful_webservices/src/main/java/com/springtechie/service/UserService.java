package com.springtechie.service;

import java.util.List;

import com.springtechie.model.User;

public interface UserService 
{
	public User saveUser(User user);
	public User getUserById(int id);
	public List<User> getAllUser();
	public String updateUserById(User emp);
	public String deleteUserById(int id);

}
