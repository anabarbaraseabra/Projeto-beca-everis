package br.com.everis.projetoEstacionamento.controller.form;

import java.time.LocalTime;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.form.AtualizacaoTopicoForm;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import br.com.everis.projetoEstacionamento.model.TicketPagamento;
import br.com.everis.projetoEstacionamento.repository.TicketPagamentoRepository;

public class AtualizaTicketForm {

	private int horaSaida = (LocalTime.now().toSecondOfDay());
	private double totalPagamento;
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getTotalPagamento() {
		return totalPagamento;
	}
	public void setTotalPagamento(double totalPagamento) {
		this.totalPagamento = totalPagamento;
	}
	
	public TicketPagamento atualizar(Long id, TicketPagamentoRepository ticketPagamentoRepository) {
		TicketPagamento ticketPagamento = ticketPagamentoRepository.getOne(id);
		ticketPagamento.setHoraSaida(this.horaSaida);
		ticketPagamento.setTotalPagamento(this.totalPagamento);
		return ticketPagamento;
	}
}

//public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, 
//		@RequestBody @Valid AtualizacaoTopicoForm form) {
//	Optional<Topico> optional = topicoRepository.findById(id);
//	if (optional.isPresent()) {
//		Topico topico = form.atualizar(id, topicoRepository);
//		return ResponseEntity.ok(new TopicoDto(topico));
//	}
//	
//	return ResponseEntity.notFound().build();
//}
//public Topico atualizar(Long id, TopicoRepository topicoRepository) {
//	Topico topico = topicoRepository.getOne(id);
//	
//	topico.setTitulo(this.titulo);
//	topico.setMensagem(this.mensagem);
//	
//	return topico;
//}