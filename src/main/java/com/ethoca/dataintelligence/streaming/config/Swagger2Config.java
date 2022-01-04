package com.ethoca.dataintelligence.streaming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

	/**
	 * Method to set paths to be included through swagger
	 *
	 * @return Docket
	 */
	@Bean
	public Docket configApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select()
				.apis(RequestHandlerSelectors.basePackage("com.ethoca.dataintelligence.streaming"))
				.paths(PathSelectors.any()).build();
	}

	/**
	 * Method to set swagger info
	 *
	 * @return ApiInfoBuilder
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Streaming API").description("Streaming API reference for developers")
				.version("1.0").build();
	}

}