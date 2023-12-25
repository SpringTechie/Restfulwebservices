package com.springtechie.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtechie.model.User;
import com.springtechie.repository.UserRepository;
import com.springtechie.service.UserService;

@Service
public class UserServiceImpl  implements UserService
{
	
	  @Autowired
	   private UserRepository usrrepo;
	
	public User saveUser(User user)
	{
		
		
		return usrrepo.save(user);
	}
	
	public User getUserById(int id)
	{
	    
		return usrrepo.findById(id).get();
	}
	
	public String updateUserById(User usr)
	{
		
		User exitsusr = usrrepo.findById(usr.getId()).orElse(null);
		  
		  if(exitsusr!=null)
		  {
			  exitsusr.setName(usr.getName());
			  exitsusr.setAddress(usr.getAddress());
			  usrrepo.save(exitsusr);
			 
		  }
		
		return "Updated succesfully";
	}
	public String deleteUserById(int id)
	{
		usrrepo.deleteById(id);
		
		return "user deleted  Succesfully";
	}

	@Override
	public List<User> getAllUser() {
		
		return usrrepo.findAll();
	}
	 
	

}
