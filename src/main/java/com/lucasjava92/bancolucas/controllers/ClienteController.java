
package com.lucasjava92.bancolucas.controllers;

import com.lucasjava92.bancolucas.dominio.Cliente;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

	@PostMapping
	public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
		System.out.println(cliente);

		if (cliente.getEmail().length() <= 3) {
			return ResponseEntity.unprocessableEntity().build();
		}

		cliente.setId(1L);

		return ResponseEntity.created(null).body(cliente);
	}
	

	@PatchMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		cliente.setId(id);

		return ResponseEntity.ok(cliente);
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletar(@PathVariable Long id) {
		return ResponseEntity.noContent().build();

	}
	

	@GetMapping
	public ResponseEntity<List<Cliente>> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("Joao@nttdata.com");
		cliente1.setEndereco("Av.Sao Jose 1250");

		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("Maria@nttdata.com");
		cliente2.setEndereco("Av.Sao Jose 1251");

		Cliente cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setEmail("Carlos@nttdata.com");
		cliente3.setEndereco("Av.Sao Jose 1252");

		Cliente cliente4 = new Cliente();
		cliente4.setId(4L);
		cliente4.setEmail("Helena@nttdata.com");
		cliente4.setEndereco("Av.Sao Jose 1253");


		return ResponseEntity.ok(List.of(cliente1, cliente2, cliente3, cliente4));

	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> obter(@PathVariable Long id) {
	
		Cliente cliente1 = new Cliente(null, null, null);
		cliente1.setId(id);
		cliente1.setEmail("Joao@nttdata.com");
		cliente1.setEndereco("Av.Sao Jose 1250");
		
		Cliente cliente2 = new Cliente(null, null, null);
		cliente2.setId(id);
		cliente2.setEmail("Joao@nttdata.com");
		cliente2.setEndereco("Av.Sao Jose 1251");

		Cliente cliente3 = new Cliente(null, null, null);
		cliente3.setId(id);
		cliente3.setEmail("Joao@nttdata.com");
		cliente3.setEndereco("Av.Sao Jose 1250");

		Cliente cliente4 = new Cliente(null, null, null);
		cliente4.setId(id);
		cliente4.setEmail("Joao@nttdata.com");
		cliente4.setEndereco("Av.Sao Jose 1250");


		return ResponseEntity(cliente1, cliente2, cliente3, cliente4);

	}


	private ResponseEntity<Cliente> ResponseEntity(Cliente cliente1, Cliente cliente2, Cliente cliente3,
			Cliente cliente4) {
		
		return null;
	}

}
