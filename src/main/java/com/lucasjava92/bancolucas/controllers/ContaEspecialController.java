package com.lucasjava92.bancolucas.controllers;

import com.lucasjava92.bancolucas.dominio.ContaCorrente;


@SuppressWarnings("unused")
public class ContaEspecialController extends ContaCorrenteController {
	
	  public void ContaEspecial(Long id, Integer numero, Integer agencia) {
	        
	        setLimite(5000d);
	        setTaxa(0.25d);
	    }

}


