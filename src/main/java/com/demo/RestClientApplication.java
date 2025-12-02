package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);

	}

	@Bean
	public RestClient getRestClient() {
		return RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
	}
}
