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

import br.com.portariacore.model.TabPessoa;
import br.com.portariacore.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@RequestMapping("listar")
	public List<TabPessoa> listAll() {
		List<TabPessoa> pessoas = repository.findAll();
		return pessoas;
	}

	@GetMapping
	@RequestMapping("buscarId/{id}")
	public Optional<TabPessoa> findId(@PathVariable Long id) {
		Optional<TabPessoa> pessoa = repository.findById(id);
		return pessoa;
	}

	@GetMapping
	@RequestMapping("buscarCpf/{cpf}")
	public TabPessoa findCpf(@PathVariable String cpf) {
		List<TabPessoa> list = repository.findAll();
		TabPessoa pessoa = new TabPessoa();
		for (TabPessoa tabPessoa : list) {
			if (tabPessoa.getCpf().equalsIgnoreCase(cpf)) {
				pessoa = tabPessoa;
				return pessoa;
			}
		}
		return null;
	}


	@GetMapping
	@RequestMapping("buscarNome/{nome}")
	public TabPessoa findName(@PathVariable String nome) {
		List<TabPessoa> list = repository.findAll();
		TabPessoa pessoa = new TabPessoa();
		for (TabPessoa tabPessoa : list) {
			if (tabPessoa.getCpf().equalsIgnoreCase(nome)) {
				pessoa = tabPessoa;
				return pessoa;
			}
		}
		return null;
	}
	@PostMapping
	public TabPessoa save(@RequestBody TabPessoa pessoa) {
		TabPessoa pessoaSalvar = repository.save(pessoa);
		return pessoaSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<TabPessoa> delete(@PathVariable Long id) {
		Optional<TabPessoa> pessoa = null;
		try {
			pessoa = repository.findById(id);
			repository.delete(pessoa.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return pessoa;

	}

	@PutMapping
	public TabPessoa update(@RequestBody TabPessoa pessoa) {
		try {
			repository.save(pessoa);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return pessoa;
	}
}
