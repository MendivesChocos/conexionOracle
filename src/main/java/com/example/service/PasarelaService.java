package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.dao.PasarelaRepository;
import com.example.model.pasarela;

@Service
@Transactional
public class PasarelaService {

	private final PasarelaRepository pasarelaRep;

	public PasarelaService(PasarelaRepository pasarelaRep) {
		super();
		this.pasarelaRep = pasarelaRep;
	}
	
	public List<pasarela> findAll(){
		
		List<pasarela> usuarios = new ArrayList<>();
		for(pasarela usuario : pasarelaRep.findAll()){
			usuarios.add(usuario);			
		}
		
		return usuarios;
	}
}
