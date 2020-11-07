package br.com.everis.projetoEstacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;

@Repository
public interface TicketPagamentoRepository extends JpaRepository<TicketPagamento, Long>{

}
