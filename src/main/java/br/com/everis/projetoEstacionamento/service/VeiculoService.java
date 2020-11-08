package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import br.com.everis.projetoEstacionamento.controller.form.CadastraVeiculoForm;
import br.com.everis.projetoEstacionamento.model.Veiculo;

public interface VeiculoService {

	public List <Veiculo> listarTodos();
	public Veiculo buscarPelaPlaca(String placa);
	public void salvarVeiculo(CadastraVeiculoForm form);
	
}
