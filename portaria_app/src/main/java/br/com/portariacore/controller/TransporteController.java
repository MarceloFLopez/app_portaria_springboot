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

import br.com.portariacore.model.TabTransporte;
import br.com.portariacore.repository.TransporteRepository;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

	@Autowired
	private TransporteRepository repository;

	@RequestMapping("/listar")
	public List<TabTransporte> listAll() {
		List<TabTransporte> transportes = repository.findAll();
		return transportes;
	}

	@GetMapping
	@RequestMapping("/buscarId/{id}")
	public Optional<TabTransporte> findId(@PathVariable Long id) {
		Optional<TabTransporte> transporte = repository.findById(id);
		return transporte;
	}

	@GetMapping
	@RequestMapping("/buscarPlaca/{placa}")
	public TabTransporte findName(@PathVariable String placa) {
		List<TabTransporte> list = repository.findAll();
		TabTransporte transporte = new TabTransporte();
		for (TabTransporte tabTransporte : list) {
			if (tabTransporte.getPlaca().equalsIgnoreCase(placa)) {
				transporte = tabTransporte;
				return transporte;
			}
		}
		return null;
	}

	@PostMapping
	public TabTransporte save(@RequestBody TabTransporte transporte) {
		TabTransporte transporteSalvar = repository.save(transporte);
		return transporteSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<TabTransporte> delete(@PathVariable Long id) {
		Optional<TabTransporte> transporte = null;
		try {
			transporte = repository.findById(id);
			repository.delete(transporte.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return transporte;

	}

	@PutMapping
	public TabTransporte update(@RequestBody TabTransporte transporte) {
		try {
			repository.save(transporte);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return transporte;
	}
}
