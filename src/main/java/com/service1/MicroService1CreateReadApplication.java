package com.service1;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class MicroService1CreateReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroService1CreateReadApplication.class, args);
	}

	@Bean
	public Docket getCustomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.service1")).paths(PathSelectors.any()).build();
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo("Create Read data Application Api Document",
				"Api documentation to perform create and read operation", "1.0", "",
				new Contact("Shradha", "", "shradha.pimpudkar@zensar.com"), "SP", "www.sp.com", new ArrayList<>());
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
