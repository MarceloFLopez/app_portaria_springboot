package br.com.portariacore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacao")
public class OperacaoController {

	@RequestMapping("/msg")
	public String exibeMensagem() {
		return "TESTE";
	}
}
