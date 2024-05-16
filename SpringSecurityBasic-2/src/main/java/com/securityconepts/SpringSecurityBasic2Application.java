package com.securityconepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;

@SpringBootApplication
public class SpringSecurityBasic2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasic2Application.class, args);
		
	//	AuthorizationFilter
	//	DefaultLoginPageGeneratingFilter
	    
	}

}