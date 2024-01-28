package com.example.BackendDevlopmentT.Common_Controll;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.BackendDevlopmentT.Entity_Classes.userdto;
import com.example.BackendDevlopmentT.Service_Data.UserDtoInterface;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Common_Controller {
    
	@Autowired
	private UserDtoInterface userservice;
	
	@GetMapping("/register")
	public String showRegistrationForm() {
	    return "register.html";
	} 
	@GetMapping("/home")
	public String home() {
	    return "home.html";
	}
	@GetMapping("/Carwash")
	public String Washcar() {
	    return "carwash.html";
	}
	@GetMapping("/CarwashDetails")
	public String Cardetails() {
	    return "cardetails.html";
	}
	
	@GetMapping("/")
	public String index()
	{
		return "index";	
	}
	@GetMapping("/Creteuser")
	public String createuser(@ModelAttribute userdto user,HttpSession Session,Model model) {
		boolean check= userservice.checkEmail(user.getEmail());
		if(check) {
			model.addAttribute("message", "Email is allready exited");
		}else {
			userdto userDto =userservice.Createuser(user);
			if(userDto != null) {
				Session.setAttribute("Msg",user );
			}else {
				Session.setAttribute("Msg", "Something wrong");
				}
		}
		
		
		return "redirect:/";
	
	}
	@GetMapping("/Welcome")
	public String Login(@ModelAttribute userdto userlog, RedirectAttributes redirectAttributes) {
		System.out.println(userlog);
		userdto authuser=userservice.login(userlog.getEmail(),userlog.getPassword());
		if(authuser!= null) {
			return "redirect:/home";
		}else {
			redirectAttributes.addFlashAttribute("loginError","Invalid email or password. Please try again.");
			return "redirect:/";
			}	
		}
	 
 } 
	
	
	

	

