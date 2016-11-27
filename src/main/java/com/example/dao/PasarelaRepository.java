package com.example.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.model.pasarela;

public interface PasarelaRepository extends CrudRepository<pasarela, Integer>{
	
	Iterable<pasarela> findAll();
	
}
