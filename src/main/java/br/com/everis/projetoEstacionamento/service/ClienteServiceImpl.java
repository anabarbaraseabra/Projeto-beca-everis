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
		if (cliente == null) {
			clienteRepository.save(cliente);
		}
	}

	@Override
	public List<Cliente> buscarClientesPeloNome(String nome) {

		return clienteRepository.findByNome(nome);
	}

	@Override
	public void deletarCliente(Cliente cliente) {
		clienteRepository.delete(cliente);

	}

	@Override
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();

	}

}
