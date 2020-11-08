package br.com.everis.projetoEstacionamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.repository.VeiculoRepository;

@Service
public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	
	@Override
	public List<Veiculo> listarTodos() {
		return veiculoRepository.findAll();
	}

	@Override
	public Veiculo buscarPelaPlaca(String placa) {
		return veiculoRepository.findByPlaca(placa);
	}

	@Override
	public void salvarVeiculo(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}

}
