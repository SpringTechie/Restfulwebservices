package com.springtechie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtechie.model.User;
import com.springtechie.service.UserService;

@RestController
public class UserController 
{
	
	
    @Autowired
	private UserService service;
    
    
   
   @PostMapping("/save")
   public User saveEmployeeIntoDatabase(@RequestBody User user)
   {
	   User savedUser = service.saveUser(user);
	   return  savedUser;
   }
   
   @GetMapping("/getById/{id}")
   public User getEmployee( @PathVariable int id)
   {
	      User user = service.getUserById(id);
	   return  user;
   }
   
   @PutMapping("/update")
   public String updateEmployee( @RequestBody  User user)
   {
	   String updatedUserById = service.updateUserById(user);
	      
	   return  updatedUserById;
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteEmployee(@PathVariable int id)
   {
	   String deletedUserById = service.deleteUserById(id);
	   return  deletedUserById;
   }
   @GetMapping("/getAllUsers")
   public List<User> getAllUsers()
   {
	   
	   return  service.getAllUser();
   }
   
}
