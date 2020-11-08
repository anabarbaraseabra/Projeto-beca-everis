package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.AtualizaTicketForm;

public interface TicketPagamentoService {
	
	public List<TicketPagamentoDto> listarTickets();
	public List<TicketPagamentoDto> findById(Long id);
	public TicketPagamentoDto atualizar(Long id, AtualizaTicketForm form);

}
