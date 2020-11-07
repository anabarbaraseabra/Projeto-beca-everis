package br.com.everis.projetoEstacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.projetoEstacionamento.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
		public List<Cliente>findByNome(String nome);
}
 