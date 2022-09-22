package com.dxc.cicd1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Cicd1Application {

	@GetMapping("/welcome")
	public String welcome() {
		return " Welcome to CICD Pipeline Demo";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Cicd1Application.class, args);
		
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/AkashDevOpsCICD/CICD-Demo1.git
//		git push -u origin main
	
	
	}

}
