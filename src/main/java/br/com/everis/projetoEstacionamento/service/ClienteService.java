package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.model.Cliente;

public interface ClienteService {
	
	public void salvarCliente(Cliente cliente);
	public Cliente buscarPorNome(String nome);
	public void deletarCliente(Long id);
	public List<Cliente> listarTodos ();
	
}
