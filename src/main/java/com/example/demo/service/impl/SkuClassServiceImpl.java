package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FSkuclass;
import com.example.demo.repository.TskuClassRepository;
import com.example.demo.service.SkuClassService;

@Service
public class SkuClassServiceImpl implements SkuClassService {
	@Autowired
	private TskuClassRepository repository;
	public FSkuclass getOne(){
		Optional<FSkuclass> findById = repository.findById("1");
		if(!findById.isPresent()){
			System.out.println("no one");
			return null;
		}
		return findById.get();
		
	}
}
