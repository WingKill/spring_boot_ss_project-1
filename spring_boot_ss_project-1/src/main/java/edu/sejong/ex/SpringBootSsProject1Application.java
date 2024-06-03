package edu.sejong.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootSsProject1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSsProject1Application.class, args);
	}
	
	@GetMapping("/")
	public String main() {
		return "안녕하세요";
	}

}
