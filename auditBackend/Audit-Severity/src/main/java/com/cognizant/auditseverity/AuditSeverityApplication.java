package com.cognizant.auditseverity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@SpringBootApplication
@EnableFeignClients
public class AuditSeverityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditSeverityApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cognizant.auditseverity"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}

	public ApiInfo apiDetails(){
		return new ApiInfo(
				"Audit Severity API",
				"API to post audit responses into db",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("AuditManagementPortal","http://localhost:4200/","audit@gmail.com"),
				"Api License",
				"http://localhost:8083/v2/api-docs",
				Collections.emptyList()
		);
	}

}
