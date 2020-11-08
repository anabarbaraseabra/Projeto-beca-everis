package br.com.everis.projetoEstacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.model.Cliente;
import br.com.everis.projetoEstacionamento.service.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	
	@GetMapping("/busca/{nome}")
	public List<Cliente> buscarClientesPeloNome (@PathVariable String nome) {
		return clienteServiceImpl.buscarClientesPeloNome(nome);
	}

	@PostMapping("/salvar")
	public void salvarCliente(@RequestBody Cliente cliente) {
		clienteServiceImpl.salvarCliente(cliente);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarCliente(@PathVariable Long id) {
		clienteServiceImpl.deletarCliente(id);
	}
	
	@GetMapping("/listar")
	public List<Cliente> listarTodos(){
		return clienteServiceImpl.listarTodos();
	}
	
}
