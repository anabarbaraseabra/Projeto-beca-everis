package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.AtualizaTicketForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public interface TicketPagamentoService {
	
	public List<TicketPagamento> listarTickets();
	public List<TicketPagamento> findAll();
	public TicketPagamentoDto atualizar(Long id, AtualizaTicketForm form);

}
