
package com.lucasjava92.bancolucas.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasjava92.bancolucas.controllers.ContaController;
import com.lucasjava92.bancolucas.dominio.Cliente;
import com.lucasjava92.bancolucas.dominio.Conta;

@RestController
@RequestMapping("/conta")

public class ContaController {
	
	@PostMapping
	public ResponseEntity<ContaT> criar(@RequestBody ContaT contaT) {
		contaT.setId(2L);
		return ResponseEntity.created(null).body(contaT);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ContaT> deletar(@PathVariable Long id) {
		return ResponseEntity.noContent().build();
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<ContaT> atualizar(@RequestBody ContaT contaT, @PathVariable Long id) {
		contaT.setId(id);
		return ResponseEntity.ok(contaT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContaT> obter(@PathVariable Long id) {
		Cliente cliente = new Cliente();
		cliente.setId(3L);
		cliente.setEmail("Programador@nttdata.com");
		
		ContaT contaT = new ContaT();
		contaT.setId(id);
		contaT.setNumero("123456789");
		contaT.setAgencia(cliente);
		
		return ResponseEntity.ok(contaT);
		
		
	}
	
	@GetMapping
	public ResponseEntity<List<Conta>> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEndereco("Av.Sao Jose 1250");
		cliente1.setEmail("Joao@nttdata.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEndereco("Av.Sao Jose 1251");
		cliente2.setEmail("Maria@nttdata.com");
		
		Cliente cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setEndereco("Av.Sao Jose 1252");
		cliente3.setEmail("Carlos@nttdata.com");
		
		Cliente cliente4 = new Cliente();
		cliente4.setId(4L);
		cliente4.setEndereco("Av.Sao Jose 1253");
		cliente4.setEmail("Helena@nttdata.com");
		
		
		ContaT conta1 = new ContaT();
		conta1.setId(1L);
		conta1.setNumero("987654321");
		conta1.setAgencia(cliente1);
		
		ContaT conta2 = new ContaT();
		conta2.setId(1L);
		conta2.setNumero("654987321");
		conta2.setAgencia(cliente2);
		
		ContaT conta3 = new ContaT();
		conta3.setId(1L);
		conta3.setNumero("321654987");
		conta3.setAgencia(cliente3);
		
		ContaT conta4 = new ContaT();
		conta4.setId(1L);
		conta4.setNumero("987321654");
		
		
		return ResponseEntity.ok(List.of (conta1, conta2, conta3, conta4));
		
		
		
	}

}
