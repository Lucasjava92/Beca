package com.lucasjava92.bancolucas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;


public class RendimentoController {
	
	@PatchMapping("/{id}")
	public ResponseEntity<ContaT> atualizar(Double taxaRendimento) {
		return null;
		
	}
	

}
