package com.lucasjava92.bancolucas.controllers;

import com.lucasjava92.bancolucas.dominio.Cliente;
import com.lucasjava92.bancolucas.dominio.Conta;


public class ContaPoupancaController extends ContaT {

	    @Override
	    public Boolean sacar(Double valor) {
	        if (saldo < valor) return false;
	        saldo -= valor;
	        return true;
	    }

	    @Override
	    public Boolean depositar(Double valor) {
	        if (valor < 0) return false;
	        saldo += valor;
	        return true;
	    }

	    @Override
	    public void atualizar(Double taxaRendimento) {
	        saldo += saldo * (taxaRendimento / 100);
	    }

		@Override
		public void setId(long l) {
			
			
		}

		@Override
		public void setNumero(String string) {
			
			
		}

		@Override
		protected void setNumero(Cliente cliente) {
		
		}

		@Override
		public void setAgencia(Cliente cliente) {
		
			
		}

		@Override
		public void setEndereco(String string) {
			
			
		}

		@Override
		public void setEmail(Conta conta1) {
		
			
		}

//implements RendimentoController
}
