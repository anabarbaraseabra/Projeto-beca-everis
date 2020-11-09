package br.com.everis.projetoEstacionamento.controller.dto;

import java.time.LocalTime;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public class TicketEntradaDto {

	private Long id;
	private String placa;
	private LocalTime horaEntrada;

	public TicketEntradaDto(TicketPagamento ticket) {
		this.id = ticket.getId();
		this.placa = ticket.getPlacaVeiculo();
		this.horaEntrada = LocalTime.now();
	}

	public Long getId() {
		return id;
	}

	public String getPlaca() {
		return placa;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

}
