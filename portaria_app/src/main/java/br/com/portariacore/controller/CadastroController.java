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

import br.com.portariacore.model.TabCadastro;
import br.com.portariacore.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	//   http://localhost:8080/
	@Autowired
	private CadastroRepository repository;

	@RequestMapping("listar")
	public List<TabCadastro> listAll() {
		List<TabCadastro> cadastros = repository.findAll();
		return cadastros;
	}

	@GetMapping
	@RequestMapping("buscarId/{id}")
	public Optional<TabCadastro> findId(@PathVariable Long id) {
		Optional<TabCadastro> cadastro = repository.findById(id);
		return cadastro;
	}

	@PostMapping
	public TabCadastro save(@RequestBody TabCadastro cadastro) {
		TabCadastro cadastroSalvar = repository.save(cadastro);
		return cadastroSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<TabCadastro> delete(@PathVariable Long id) {
		Optional<TabCadastro> cadastro = null;
		try {
			cadastro = repository.findById(id);
			repository.delete(cadastro.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return cadastro;
	}

	@PutMapping
	public TabCadastro update(@RequestBody TabCadastro cadastro) {
		try {
			repository.save(cadastro);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return cadastro;
	}
}
