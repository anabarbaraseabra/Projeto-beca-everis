package br.com.everis.projetoEstacionamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.controller.dto.TicketEntradaDto;
import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.TicketEntradaForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.service.TicketPagamentoServiceImpl;

@RestController
@RequestMapping("/ticket")
public class TicketPagamentoController {

	@Autowired
	TicketPagamentoServiceImpl ticketPagamentoServiceImpl;

	@PutMapping("/entrada")
	public TicketEntradaDto gerarTicketEntrada(@RequestBody TicketEntradaForm form) {
		return ticketPagamentoServiceImpl.gerarTicketEntrada(form);
	}

	@PutMapping("/saida/{id}")
	public ResponseEntity<TicketPagamentoDto> gerarTicketSaida(@PathVariable Long id) {
		Optional<TicketPagamento> ticket = ticketPagamentoServiceImpl.buscarPeloId(id);
		if (ticket.isPresent()) {
			return ResponseEntity.ok(ticketPagamentoServiceImpl.gerarTicketSaida(id));
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping("/buscar/{id}")
	public TicketPagamento buscarPorId(@PathVariable Long id) {
		return ticketPagamentoServiceImpl.buscarPeloId(id).get();
	}

	@GetMapping("/listar")
	public List<TicketPagamentoDto> listarTickets() {
		List<TicketPagamento> tickets = ticketPagamentoServiceImpl.listarTickets();
		return TicketPagamentoDto.converter(tickets);
	}

}
