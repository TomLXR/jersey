package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

@JsonRootName("city")
@JsonInclude(value=Include.NON_EMPTY)
public class City {
	//@JsonProperty("id")
	@Attr("id")
	public String id;
	
	@JsonProperty("cityname")
	public String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
