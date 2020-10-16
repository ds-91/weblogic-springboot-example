package com.example.weblogicspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class WeblogicSpringbootApplication extends
		SpringBootServletInitializer implements
		WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(WeblogicSpringbootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WeblogicSpringbootApplication.class, args);
	}

}
