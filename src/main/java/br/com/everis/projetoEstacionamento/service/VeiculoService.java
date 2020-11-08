package br.com.everis.projetoEstacionamento.service;

import java.util.List;
import java.util.Optional;

import br.com.everis.projetoEstacionamento.model.Veiculo;

public interface VeiculoService {

	public List <Veiculo> listarTodos();
	public Optional <Veiculo> buscarPeloId(Long id);
	public void salvarVeiculo(Veiculo veiculo);
	
}
