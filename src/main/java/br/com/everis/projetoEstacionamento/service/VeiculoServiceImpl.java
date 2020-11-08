package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.controller.form.CadastraVeiculoForm;
import br.com.everis.projetoEstacionamento.model.Cliente;
import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.repository.VeiculoRepository;

@Service
public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;

	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	
	@Override
	public List<Veiculo> listarTodos() {
		return veiculoRepository.findAll();
	}

	@Override
	public Veiculo buscarPelaPlaca(String placa) {
		return veiculoRepository.findByPlaca(placa);
	}

	@Override
	public void salvarVeiculo(CadastraVeiculoForm form) {
		Cliente cliente = (Cliente) clienteServiceImpl.buscarClientesPeloNome(form.getNomeCliente());
		Veiculo veiculo = new Veiculo(form.getModelo(),form.getPlaca(), cliente);
		veiculoRepository.save(veiculo);
	}

}
