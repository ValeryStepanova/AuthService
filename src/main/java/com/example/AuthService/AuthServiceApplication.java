package com.example.AuthService;

import com.example.AuthService.configuration.RsaKeyProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		//String json = ow.writeValueAsString(object);
	}

}
