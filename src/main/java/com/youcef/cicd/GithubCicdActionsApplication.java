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


	/**echo "# github-actions-ex" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/YoucefBenabderrahmane/github-actions-ex.git
	git push -u origin main*/
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
