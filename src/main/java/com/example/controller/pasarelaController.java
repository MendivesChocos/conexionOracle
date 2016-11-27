package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PasarelaRepository;
import com.example.service.PasarelaService;

@RestController
public class pasarelaController {

	@Autowired
	private PasarelaRepository pasarelaRepository;
	
	@GetMapping("/all-task")
	public String allPasarela(){
		return pasarelaRepository.findAll().toString();
		
	}
}
