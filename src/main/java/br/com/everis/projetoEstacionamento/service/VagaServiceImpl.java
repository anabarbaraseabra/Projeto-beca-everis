package br.com.everis.projetoEstacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.model.Vaga;
import br.com.everis.projetoEstacionamento.repository.VagaRepository;

@Service
public class VagaServiceImpl implements VagaService {

	@Autowired
	VagaRepository vagaRepository;

	@Override
	public boolean statusVaga(Vaga vaga) {
		return vaga.isOcupada();
	}

	@Override
	public void ocuparVaga(Vaga vaga) {
		if (!statusVaga(vaga)) {
			vaga.setOcupada(true);
		}
	}

	@Override
	public void desocuparVaga(Vaga vaga) {
		if (statusVaga(vaga)) {
			vaga.setOcupada(false);
		}
	}

	@Override
	public List<Vaga> listarVagas() {
		return vagaRepository.findAll();
	}
	

	

}
