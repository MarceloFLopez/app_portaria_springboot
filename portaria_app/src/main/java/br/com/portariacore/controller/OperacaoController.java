package br.com.portariacore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portariacore.model.TabOperacao;
import br.com.portariacore.repository.OperacaoRepository;

@RestController
@RequestMapping("/operacao")
public class OperacaoController {

	@Autowired
	private OperacaoRepository repository;

	@RequestMapping("/listar")
	public List<TabOperacao> listAll() {
		List<TabOperacao> operacoes = repository.findAll();
		return operacoes;
	}

	@RequestMapping("/buscar/{nome}")
	@GetMapping
	public TabOperacao buscarPorNome(@PathVariable String nome) {
		List<TabOperacao> list = repository.findAll();
		TabOperacao operacao = new TabOperacao();
		for (TabOperacao tabOperacao : list) {
			if (tabOperacao.getName().equalsIgnoreCase(nome)) {
				operacao = tabOperacao;
				return operacao;
			} 
		}
		return null;
	}
}
