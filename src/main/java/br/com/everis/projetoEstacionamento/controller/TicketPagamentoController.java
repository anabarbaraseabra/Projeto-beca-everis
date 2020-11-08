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

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.everis.projetoEstacionamento.controller.dto.TicketPagamentoDto;
import br.com.everis.projetoEstacionamento.controller.form.AtualizaTicketForm;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.service.TicketPagamentoServiceImpl;

@RestController
@RequestMapping("/pagamento")
public class TicketPagamentoController {

	@Autowired
	TicketPagamentoServiceImpl ticketPagamentoServiceImpl;

	@PostMapping("/gerarTicketEntrada")
	public void gerarTicketEntrada() {
	}

	@PutMapping("/gerarTicketSaida/{id}")
	public ResponseEntity<TicketPagamentoDto> atualizar(@PathVariable Long id, AtualizaTicketForm form) {
		Optional<TicketPagamento> ticket = ticketPagamentoServiceImpl.findById(id).get();
		if (ticket.isPresent()) {
			return ResponseEntity.ok(ticketPagamentoServiceImpl.atualizar(id, form));
		} else {
			return ResponseEntity.notFound().build();
		}

	}
	
	@GetMapping("/buscar/{id}")
	public TicketPagamentoDto buscarPorId(@PathVariable Long id) {
		return ticketPagamentoServiceImpl.findById(id).get();
	}


	@GetMapping("/listar")
	public List<TicketPagamentoDto> listarTickets() {
		return ticketPagamentoServiceImpl.listarTickets();
	}

}
