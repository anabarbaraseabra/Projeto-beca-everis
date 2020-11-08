package br.com.everis.projetoEstacionamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.service.VeiculoServiceImpl;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
	VeiculoServiceImpl veiculoServiceImpl;

	@GetMapping("/listarTodos")
	public List<Veiculo> listarTodos() {
		return veiculoServiceImpl.listarTodos();
	}

	
	public Optional<Veiculo> buscarPelaPlaca(String placa) {
		return veiculoServiceImpl.buscarPelaPlaca(placa);
	}

	public void salvarVeiculo(Veiculo veiculo) {
		veiculoServiceImpl.salvarVeiculo(veiculo);
	}

}
