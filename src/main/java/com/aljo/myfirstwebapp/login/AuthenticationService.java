package com.aljo.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("Bashir");
		boolean isValidPassword = password.equalsIgnoreCase("Bashir");
		
		return isValidUserName && isValidPassword;
	}
}