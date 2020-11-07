package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.model.Vaga;

public interface VagaService {
	
	public List<Vaga> listarVagas();

	void ocuparVaga(Vaga vaga);

	boolean statusVaga(Vaga vaga);

	void desocuparVaga(Vaga vaga);
	
}
