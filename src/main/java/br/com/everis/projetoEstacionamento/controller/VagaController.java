package br.com.everis.projetoEstacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.projetoEstacionamento.service.VagaServiceImpl;

@RestController
@RequestMapping("/vagas")
public class VagaController {

	@Autowired
	VagaServiceImpl vagaServiceImpl;
	

	
	
}
