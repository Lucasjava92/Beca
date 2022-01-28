
package com.lucasjava92.bancolucas.dominio;

public abstract class Conta {

	    private Long id;
	    private Integer numero;
	    private Integer agencia;
	    protected Double saldo = 0d;
	    
	    public Conta() {
	    	
	    }

	    public Conta(Long id, Integer numero, Integer agencia) {
	        this.id = id;
	        this.numero = numero;
	        this.agencia = agencia;
	    }


		public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Integer getNumero() {
	        return numero;
	    }
	 
	    public Integer getAgencia() {
	        return agencia;
	    }

	    public Double getSaldo() {
	        return saldo;
	    }

	    protected abstract Boolean sacar(Double valor);

	     public abstract Boolean depositar(Double valor);

	      public Boolean transferir(Double valor, Conta favorecido) {
	         if (sacar(valor)) return favorecido.depositar(valor);
	           return false;


	      }

	      public abstract void setId(long id);
	  	
			public abstract void setNumero(String string);

			protected abstract void setNumero(Cliente cliente);

			public abstract void setAgencia(Cliente cliente);

			public abstract void setEndereco(String string);

			public abstract void setEmail(Conta conta1);

			public void atualizar(Double taxaRendimento) {
				
				
			}

}
