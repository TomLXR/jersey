package com.example.demo.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("restful")
public class JerseyConfig extends ResourceConfig {
	
	
	public JerseyConfig(){
		packages("com.example.demo.jersey.rest");
	}

}
