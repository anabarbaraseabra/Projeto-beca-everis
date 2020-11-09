package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.model.Cliente;
import br.com.everis.projetoEstacionamento.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public void salvarCliente(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public Cliente buscarPorNome (String nome) {
		return clienteRepository.findByNome(nome);
	}

	@Override
	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);

	}

	@Override
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();

	}

}
