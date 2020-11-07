package br.com.everis.projetoEstacionamento.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TicketPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int horaEntrada = (LocalTime.now().toSecondOfDay());
	private String horaSaida;
	private double precoFracao = 3.5;
	@OneToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public double calculaPagamento(String horaSaida) {
		int horaSaidaInt = LocalTime.parse(this.horaSaida).toSecondOfDay();
		double fracao = ((horaSaidaInt - horaEntrada)/60)/15;
		if(fracao > (int)fracao) {
			fracao = (int) fracao+1;
		}
		double valorTotal = fracao * this.precoFracao;
		return valorTotal;
	}

}
