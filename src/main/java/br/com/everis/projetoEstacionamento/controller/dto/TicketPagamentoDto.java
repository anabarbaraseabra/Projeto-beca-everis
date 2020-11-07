package br.com.everis.projetoEstacionamento.controller.dto;

import java.time.LocalDateTime;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.model.Veiculo;

public class TicketPagamentoDto {

	private Long id;
	private String placa;
	private int horaEntrada;
	private String horaSaida;
	private double TotalPagamento;

	public TicketPagamentoDto(Veiculo veiculo, TicketPagamento ticket) {
		this.id = ticket.getId();
		this.placa = veiculo.getPlaca();
		this.horaEntrada = ticket.getHoraEntrada();
		this.horaSaida = ticket.getHoraSaida();
		//this.TotalPagamento = ticket.calculaPagamento();
	}

	public String getPlaca() {
		return placa;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public double getTotalPagamento() {
		return TotalPagamento;
	}

	public Long getId() {
		return id;
	}

}
