package br.com.everis.projetoEstacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.projetoEstacionamento.model.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{

}
