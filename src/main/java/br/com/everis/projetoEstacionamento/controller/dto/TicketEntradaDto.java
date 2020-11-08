package br.com.everis.projetoEstacionamento.controller.dto;

import java.time.LocalTime;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public class TicketEntradaDto {

	private Long id;
	private String placa;
	private int horaEntrada = LocalTime.now().getSecond();

	public TicketEntradaDto(TicketPagamento ticket) {
		this.id = ticket.getId();
		this.placa = ticket.getPlacaVeiculo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

}
