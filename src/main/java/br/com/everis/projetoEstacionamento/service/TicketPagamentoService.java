package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

public interface TicketPagamentoService {
	
	public List<TicketPagamento> listarTickets();
	public List<TicketPagamento> findAll();
	public TicketPagamentoDto atualizar(Long id, TicketPagamentoRepository ticketPagamentoRepository);

}
