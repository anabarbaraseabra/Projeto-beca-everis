package br.com.everis.projetoEstacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.everis.projetoEstacionamento.controller.dto.TicketEntradaDto;
import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.TicketEntradaForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public interface TicketPagamentoService {
	
	public List<TicketPagamento> listarTickets();
	public Optional<TicketPagamento> buscarPeloId(Long id);
	public TicketEntradaDto gerarTicketEntrada(TicketEntradaForm form);
	public TicketPagamentoDto gerarTicketSaida(Long id);
		
	}


