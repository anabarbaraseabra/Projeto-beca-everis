package br.com.everis.projetoEstacionamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.AtualizaTicketForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.service.TicketPagamentoServiceImpl;

@RestController
@RequestMapping("/ticket")
public class TicketPagamentoController {

	@Autowired
	TicketPagamentoServiceImpl ticketPagamentoServiceImpl;

	@PostMapping("/gerarEntrada")
	public void gerarTicketEntrada(TicketPagamento ticketPagamento) {
		ticketPagamentoServiceImpl.gerarTicketEntrada(ticketPagamento);
		
	}

	@PutMapping("/gerarTicketSaida/{id}")
	public ResponseEntity<TicketPagamentoDto> gerarTicketSaida(@PathVariable Long id, AtualizaTicketForm form) {
		Optional<TicketPagamento> ticket = ticketPagamentoServiceImpl.buscarPeloId(id);
		if (ticket.isPresent()) {
			return ResponseEntity.ok(ticketPagamentoServiceImpl.gerarTicketSaida(id, form));
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
