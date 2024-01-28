package com.example.BackendDevlopmentT.Service_Data;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.BackendDevlopmentT.Entity_Classes.userdto;
import com.example.BackendDevlopmentT.Ripository.UserDtoRipo;

@Service
public class userDtoServiceImplement implements UserDtoInterface{
	
	
	@Autowired
	private UserDtoRipo userRipo;
	
	@Override
	public userdto Createuser(userdto user) {
		
		return	userRipo.save(user);
	}
	
	@Override
	public boolean checkEmail(String email) {
	return userRipo.existsByEmail(email);
		
	}

	@Override
	public userdto login(String email, String password) {
		userdto user=userRipo.findByUsernameAndPassword(email, password);
		return user;
	}

	

	

	

}
