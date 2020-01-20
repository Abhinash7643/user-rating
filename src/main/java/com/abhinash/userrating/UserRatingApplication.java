package com.abhinash.userrating;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserRatingApplication {



	public static void main(String[] args) {
		SpringApplication.run(UserRatingApplication.class, args);
	}

}
