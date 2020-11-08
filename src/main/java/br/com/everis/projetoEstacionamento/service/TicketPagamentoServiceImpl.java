package br.com.everis.projetoEstacionamento.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.TicketEntradaForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.model.Veiculo;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

@Service
public class TicketPagamentoServiceImpl implements TicketPagamentoService {

	@Autowired
	TicketPagamentoRepository ticketPagamentoRepository;
	VeiculoServiceImpl veiculoServiceImpl;

	@Override
	public List<TicketPagamento> listarTickets() {
		return ticketPagamentoRepository.findAll();
	}

	@Override
	public TicketPagamento buscarPeloId(Long id) {
		return ticketPagamentoRepository.findById(id).get();

	}

	@Override
	public TicketPagamento gerarTicketEntrada(TicketEntradaForm form) {
		Veiculo veiculo = veiculoServiceImpl.buscarPelaPlaca(form.getPlaca());
		return new TicketPagamento(LocalTime.now(), veiculo);
	}

	@Override
	public TicketPagamentoDto gerarTicketSaida(Long id) {
		TicketPagamento ticketPagamento = ticketPagamentoRepository.findById(id).get();
		ticketPagamento.setHoraSaida(LocalTime.now());
		ticketPagamento.setTotalPagamento(ticketPagamento.getHoraSaida());
		return new TicketPagamentoDto(ticketPagamento);
	}

}
