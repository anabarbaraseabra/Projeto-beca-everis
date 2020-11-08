package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.AtualizaTicketForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

@Service
public class TicketPagamentoServiceImpl implements TicketPagamentoService {

	@Autowired
	TicketPagamentoRepository ticketPagamentoRepository;

	@Override
	public List<TicketPagamento> listarTickets() {
		return ticketPagamentoRepository.findAll();
	}

	@Override
	public List<TicketPagamento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketPagamentoDto atualizar(Long id, AtualizaTicketForm form) {
			TicketPagamento ticketPagamento = ticketPagamentoRepository.getOne(id);
			ticketPagamento.setHoraSaida(form.getHoraSaida());
			ticketPagamento.setTotalPagamento(ticketPagamento.getHoraSaida());
			return new TicketPagamentoDto(ticketPagamento);
	}

}
