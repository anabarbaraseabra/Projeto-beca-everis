package br.com.everis.projetoEstacionamento.controller.dto;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;

public class TicketPagamentoDto {

	private Long id;
	private String placa;
	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	private double TotalPagamento;

	public TicketPagamentoDto(TicketPagamento ticket) {
		this.id = ticket.getId();
		this.placa = ticket.getPlacaVeiculo();
		this.horaEntrada = ticket.getHoraEntrada();
		this.horaSaida = ticket.getHoraSaida();
		this.TotalPagamento = ticket.getTotalPagamento();
	}

	public String getPlaca() {
		return placa;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public double getTotalPagamento() {
		return TotalPagamento;
	}

	public Long getId() {
		return id;
	}
	
	public static List<TicketPagamentoDto> converter(List<TicketPagamento> ticketsPagamento) {
		return ticketsPagamento.stream().map(TicketPagamentoDto::new).collect(Collectors.toList());
	}

}
