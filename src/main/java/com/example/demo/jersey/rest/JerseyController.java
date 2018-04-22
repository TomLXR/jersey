package com.example.demo.jersey.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.demo.model.City;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Path("jersey")
public class JerseyController {

	
	@Path("city")
	@GET
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	//@Consumes(MediaType.APPLICATION_JSON)
	public String get() throws JsonProcessingException{
		City c=new City();
		ObjectMapper mapper=new ObjectMapper();
		c.setId("1");
		c.setName("北京");
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);  
		return mapper.writeValueAsString(c);
	}
}
