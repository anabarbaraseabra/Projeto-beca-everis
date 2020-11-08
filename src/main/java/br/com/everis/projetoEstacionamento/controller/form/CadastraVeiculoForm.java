package br.com.everis.projetoEstacionamento.controller.form;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.everis.projetoEstacionamento.model.Cliente;

public class CadastraVeiculoForm {

	private String modelo;
	private String placa;
	private String nomeCliente;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
