package br.com.everis.projetoEstacionamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.repository.VeiculoRepository;

public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	
	@Override
	public List<Veiculo> listarTodos() {
		return veiculoRepository.findAll();
	}

	@Override
	public Optional<Veiculo> buscarPeloId(Long id) {
		return veiculoRepository.findById(id);
	}

	@Override
	public void salvarVeiculo(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}

}
