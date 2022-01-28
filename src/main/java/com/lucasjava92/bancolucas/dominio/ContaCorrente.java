package com.lucasjava92.bancolucas.dominio;

public class ContaCorrente extends Conta {

    private Double limite = 1000d;
    private Double taxa = 0.5d;

    public ContaCorrente(Long id, Integer numero, Integer agencia) {
        super(id, numero, agencia);
    }

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

    public Double getSaldoComLimite() {
        return saldo + limite;
    }

    @Override
    public Boolean sacar(Double valor) {
        if (valor <= 0 && getSaldoComLimite() < valor) return false;
        saldo -= valor + taxa;
        return true;
    }

    @Override
    public Boolean depositar(Double valor) {
        if (valor <= 0) return false;
        saldo += (valor - taxa);
        return true;
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
		// TODO Auto-generated method stub
		
	}

}
