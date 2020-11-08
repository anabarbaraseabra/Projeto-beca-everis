package br.com.everis.projetoEstacionamento.controller.form;

import java.time.LocalTime;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

public class AtualizaTicketForm {

	private int horaSaida = (LocalTime.now().toSecondOfDay());

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public TicketPagamento atualizar(Long id, TicketPagamentoRepository ticketPagamentoRepository) {
		TicketPagamento ticketPagamento = ticketPagamentoRepository.getOne(id);
		ticketPagamento.setHoraSaida(this.horaSaida);
		return ticketPagamento;
	}
}
