package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

@Service
public class TicketPagamentoServiceImpl {

	@Autowired
	TicketPagamentoRepository ticketPagamentoRepository;

	public List<TicketPagamento> listarTickets() {
		return ticketPagamentoRepository.findAll();
	}

}
