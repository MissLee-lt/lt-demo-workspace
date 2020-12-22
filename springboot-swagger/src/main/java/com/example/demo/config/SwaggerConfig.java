package com.example.demo.config;

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
@EnableSwagger2 // TODO:开启Swagger2
public class SwaggerConfig {
	// http://localhost:8080/v2/api-docs

	// TODO:配置Swagger的Bean实例
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))//扫描com路径下的api文档
				.paths(PathSelectors.any())//路径判断
				.build();
	}

	// TODO：配置API的基本信息（会在http://localhost:8080/swagger-ui.html页面显示）
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Swagger开发规范")
				.description("Saggger开发描述")
				.termsOfServiceUrl("http://www.baidu.com")
				.version("1.0.0")
				.build();
	}
}
