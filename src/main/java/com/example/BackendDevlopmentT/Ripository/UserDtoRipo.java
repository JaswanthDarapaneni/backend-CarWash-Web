package com.example.BackendDevlopmentT.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BackendDevlopmentT.Entity_Classes.userdto;

public interface UserDtoRipo extends JpaRepository<userdto, String> {
  public boolean existsByEmail(String email);
  public userdto findByUsernameAndPassword(String email,String password);
	
}
