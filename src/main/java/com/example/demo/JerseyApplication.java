package com.example.demo;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.jersey.JerseyConfig;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.example.demo"})
@EntityScan(basePackages={"com.example.demo.entity"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class JerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyApplication.class, args);
	}
	
	
	@Bean
	public ServletRegistrationBean jersetServlet() {  
	ServletRegistrationBean registration = new ServletRegistrationBean(  
	// 顶级uri 用来区分SpringMVC  
	new ServletContainer(), "/restful/*");  
	registration.addInitParameter(
	ServletProperties.JAXRS_APPLICATION_CLASS,  
	JerseyConfig.class.getName());  
	return registration;  
	  
	} 
}
