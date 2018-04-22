package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MRelateSalesItemArea;
import com.example.demo.entity.TCtsType;


@Repository
public interface MRelateSalesItemAreaRepository extends JpaRepository<MRelateSalesItemArea, Long>{

}
