package com.example.BackendDevlopmentT.Entity_Classes;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
public class user_Login_Entity {
    @Id
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user_Login_Entity [email=" + email + ", password=" + password + "]";
	}
	public user_Login_Entity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public user_Login_Entity() {}
	
}
