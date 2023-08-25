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

import br.com.portariacore.model.WRegistro;
import br.com.portariacore.repository.RegistroRepository;

@RestController
@RequestMapping("/registro")
public class WRegistroController {

	@Autowired
	private RegistroRepository repository;

	@RequestMapping("/listar")
	public List<WRegistro> listAll() {
		List<WRegistro> registros = repository.findAll();
		return registros;
	}

	@GetMapping
	@RequestMapping("/buscarId/{id}")
	public Optional<WRegistro> findId(@PathVariable Long id) {
		Optional<WRegistro> registro = repository.findById(id);
		return registro;
	}

	@PostMapping
	public WRegistro save(@RequestBody WRegistro registro) {
		WRegistro registroSalvar = repository.save(registro);
		return registroSalvar;
	}

	@DeleteMapping("/delete/{id}")
	public Optional<WRegistro> delete(@PathVariable Long id) {
		Optional<WRegistro> registro = null;
		try {
			registro = repository.findById(id);
			repository.delete(registro.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return registro;
	}

	@PutMapping
	public WRegistro update(@RequestBody WRegistro registro) {
		try {
			repository.save(registro);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return registro;
	}
}
