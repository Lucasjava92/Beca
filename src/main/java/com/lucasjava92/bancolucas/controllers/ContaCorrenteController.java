
package com.lucasjava92.bancolucas.controllers;

public class ContaCorrenteController {
	
	 private Double limite = 1000d;
	    private Double taxa = 0.5d;
	      

	    public Double getLimite() {
	        return limite;
	    }

	    public void setLimite(Double limite) {
	        this.limite = limite;
	    }

	    public Double getTaxa() {
	        return taxa;
	    }

	    public void setTaxa(Double taxa) {
	        this.taxa = taxa;
	    }


}
