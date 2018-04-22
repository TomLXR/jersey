package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MRelateSalesItemArea;
import com.example.demo.entity.TCtsType;
import com.example.demo.repository.MRelateSalesItemAreaRepository;
import com.example.demo.service.MRelateSalesItemAreaService;

@Service
public class MRelateSalesItemAreaServiceImpl implements MRelateSalesItemAreaService {
@Autowired
private MRelateSalesItemAreaRepository repository; 
	@Override
	public MRelateSalesItemArea getOne() {
		  Optional<MRelateSalesItemArea> findById = repository.findById(1L);
		  if(!findById.isPresent()){
			  return null;
		  }
		return findById.get();
	}

}
