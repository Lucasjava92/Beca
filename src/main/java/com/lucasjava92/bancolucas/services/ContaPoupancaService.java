package com.lucasjava92.bancolucas.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.lucasjava92.bancolucas.controllers.ContaT;

@Service
public interface ContaPoupancaService {
	
	public ContaT criar (ContaT contaT);
	public ContaT atualizar (ContaT contaT, Long id);
	public List<ContaT> listarTodos();
	public ContaT listarPorId(Long id);
	public ContaT excluir(Long id);

}
