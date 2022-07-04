package br.com.portariacore.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping
	@RequestMapping("buscarId/{id}")
	public Optional<TabOperacao> findId(@PathVariable Long id) {
		Optional<TabOperacao> operacao = repository.findById(id);
		return operacao;
	}

	@GetMapping
	@RequestMapping("buscarNome/{nome}")
	public TabOperacao findName(@PathVariable String nome) {
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

	@PostMapping
	public TabOperacao save(@RequestBody TabOperacao operacao) {
		TabOperacao operacaoSalvar = repository.save(operacao);
		return operacaoSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<TabOperacao> delete(@PathVariable Long id) {
		Optional<TabOperacao> operacao = null;
		try {
			operacao = repository.findById(id);
			repository.delete(operacao.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return operacao;
	}

	@PutMapping
	public TabOperacao update(@RequestBody TabOperacao operacao) {
		try {
			repository.save(operacao);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return operacao;
	}
}
