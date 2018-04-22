package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FSkuclass;
import com.example.demo.entity.MRelateSalesItemArea;
import com.example.demo.entity.TCtsType;
import com.example.demo.service.SkuClassService;
import com.example.demo.service.MRelateSalesItemAreaService;

@RestController

public class Controller {
	@Autowired
	private SkuClassService skuClassService;
	
	
	@Autowired
	private MRelateSalesItemAreaService service;
	@RequestMapping("demo")
	public String index(){
		//FSkuclass one = skuClassService.getOne();
		//System.out.println(one.getContentName());
		MRelateSalesItemArea one = service.getOne();
		if(one!=null){
			System.out.println(one.getId());
		}
		return "enen";
	}
}
