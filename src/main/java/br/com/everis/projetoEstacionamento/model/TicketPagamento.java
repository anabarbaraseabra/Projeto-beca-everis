package br.com.everis.projetoEstacionamento.model;

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
	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	private double precoFracao = 3.5;
	@OneToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;
	private double totalPagamento;
	
	

	public TicketPagamento() {}

	public TicketPagamento(LocalTime horaEntrada, Veiculo veiculo) {
		this.horaEntrada = horaEntrada;
		this.veiculo = veiculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getPlacaVeiculo() {
		return veiculo.getPlaca();
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void setTotalPagamento(LocalTime horaSaida) {
		double fracao = ((horaSaida.getSecond() - this.horaEntrada.getSecond()) / 60) / 15;
		if (fracao > (int) fracao) {
			fracao = (int) fracao + 1;
		}
		double valorTotal = fracao * this.precoFracao;
		this.totalPagamento = valorTotal;
	}

	public double getTotalPagamento() {
		return totalPagamento;
	}

}
