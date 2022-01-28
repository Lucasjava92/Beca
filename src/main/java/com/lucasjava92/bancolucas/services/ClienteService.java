package com.lucasjava92.bancolucas.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ClienteService<ContaT> {
	
	public ContaT criar (ContaT contaT);
	public ContaT atualizar (ContaT contaT, Long id);
	public List<ContaT> listarTodos();
	public ContaT listarPorId(Long id);
	public ContaT excluir(Long id);

}
