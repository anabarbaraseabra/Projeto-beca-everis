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
	private int horaEntrada = (LocalTime.now().toSecondOfDay());
	private int horaSaida = (LocalTime.now().toSecondOfDay());
	private double precoFracao = 3.5;
	@OneToOne
	@JoinColumn(name = "id_veiculo")
	private double totalPagamento;
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

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
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

	public void setTotalPagamento(int horaSaida) {
		double fracao = ((horaSaida - this.horaEntrada)/60)/15;
		if(fracao > (int)fracao) {
			fracao = (int) fracao+1;
		}
		double valorTotal = fracao * this.precoFracao;
		this.totalPagamento = valorTotal;
	}
	
	public double getTotalPagamento() {
		return totalPagamento;
	}
	
	

}
