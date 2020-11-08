package br.com.everis.projetoEstacionamento.controller.form;

import java.time.LocalTime;

public class TicketEntradaForm {

	private String placa;
	private int horaEntrada = LocalTime.now().getSecond();

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
