package br.com.everis.projetoEstacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.controller.form.CadastraVeiculoForm;
import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.service.VeiculoServiceImpl;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
	VeiculoServiceImpl veiculoServiceImpl;

	@GetMapping("/listar")
	public List<Veiculo> listarTodos() {
		return veiculoServiceImpl.listarTodos();
	}

	@GetMapping("/buscarPorPlaca/{placa}")
	public Veiculo buscarPelaPlaca(@PathVariable String placa) {
		return veiculoServiceImpl.buscarPelaPlaca(placa);
	}

	@PostMapping("/salvar")
	public void salvarVeiculo(@RequestBody CadastraVeiculoForm form) {
		veiculoServiceImpl.salvarVeiculo(form);
	}

}
