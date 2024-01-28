package com.example.BackendDevlopmentT.Service_Data;

import com.example.BackendDevlopmentT.Entity_Classes.user_Login_Entity;
import com.example.BackendDevlopmentT.Entity_Classes.userdto;

public interface UserDtoInterface {

	public  userdto Createuser(userdto user);
	public boolean checkEmail(String email);
	public userdto login(String email,String password);
	
	}

