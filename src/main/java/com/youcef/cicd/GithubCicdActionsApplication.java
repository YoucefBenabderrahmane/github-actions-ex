package com.youcef.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {
	
	@GetMapping("/message")
	public String message(){
		return "Youcef Ben"
				+ "SpringBoot - Build CI/CD Pipeline Using GitHub Actions | Build & Push Docker Image fo AL ";
	}



	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
