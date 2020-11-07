package br.com.everis.projetoEstacionamento.utils.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.everis.projetoEstacionamento.model.Cliente;
import br.com.everis.projetoEstacionamento.repository.ClienteRepository;

@Component
public class PopulandoAClasseCliente {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	//@PostConstruct
	public void salvarClientes() {
		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente1 = new Cliente("ana barbara", "ana1@gmail.com", "33333333");
		Cliente cliente2 = new Cliente("ana laura", "ana2@gmail.com", "44444444");
		Cliente cliente3 = new Cliente("ana betriz", "ana3@gmail.com", "55555555");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		for (Cliente cliente: clientes) {
			Cliente clienteSalvo = clienteRepository.save(cliente);
			System.out.println(clienteSalvo.getId());
		}
	}
}
