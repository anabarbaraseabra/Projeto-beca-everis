package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.TicketEntradaForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public interface TicketPagamentoService {
	
	public List<TicketPagamento> listarTickets();
	public TicketPagamento buscarPeloId(Long id);
	public TicketPagamento gerarTicketEntrada (TicketEntradaForm form);
	public TicketPagamentoDto gerarTicketSaida(Long id);
		
	}


