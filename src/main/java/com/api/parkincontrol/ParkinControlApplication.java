package com.api.parkincontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController /*Bean do tipo controller*/
public class ParkinControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinControlApplication.class, args);
	}

	@GetMapping("/") /*Define a raiz do projeto*/
	public String index(){
		return "Olá Mundo!";
	}
}
