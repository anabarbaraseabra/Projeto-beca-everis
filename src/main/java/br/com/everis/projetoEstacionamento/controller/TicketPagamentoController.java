package br.com.everis.projetoEstacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.service.TicketPagamentoServiceImpl;

@RestController
@RequestMapping("/pagamento")
public class TicketPagamentoController {

	@Autowired
	TicketPagamentoServiceImpl ticketPagamentoServiceImpl;
	
	@PostMapping("/gerarTicketEntrada")
	public void gerarTicketEntrada(){}
	
	@PutMapping("/gerarTicketSaida")
	public void gerarTicketSaida(){}
	
	@GetMapping("/listar")
	public List<TicketPagamento> listarTickets (){
		return ticketPagamentoServiceImpl.listarTickets();
	}
	
	
}
