package com.lucasjava92.bancolucas.dominio;


public class ContaEspecial extends ContaCorrente implements Rendimento {

    public ContaEspecial(Long id, Integer numero, Integer agencia) {
        super(id, numero, agencia);
        setLimite(5000d);
        setTaxa(0.25d);
    }

    @Override
    public void atualizar(Double taxaRendimento) {
        saldo += saldo * (taxaRendimento / 100);
    }

}
