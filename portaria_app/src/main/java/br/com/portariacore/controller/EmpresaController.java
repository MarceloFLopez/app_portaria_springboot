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

import br.com.portariacore.model.TabEmpresa;
import br.com.portariacore.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaRepository repository;

	@RequestMapping("/listar")
	public List<TabEmpresa> listAll() {
		List<TabEmpresa> empresas = repository.findAll();
		return empresas;
	}

	@GetMapping
	@RequestMapping("buscarId/{id}")
	public Optional<TabEmpresa> findId(@PathVariable Long id) {
		Optional<TabEmpresa> empresa = repository.findById(id);
		return empresa;
	}

	@GetMapping
	@RequestMapping("/buscarPlaca/{cnpj}")
	public TabEmpresa findName(@PathVariable String cnpj) {
		List<TabEmpresa> list = repository.findAll();
		TabEmpresa empresa = new TabEmpresa();
		for (TabEmpresa tabEmpresa : list) {
			if (tabEmpresa.getCnpj().equalsIgnoreCase(cnpj)) {
				empresa = tabEmpresa;
				return empresa;
			}
		}
		return null;
	}

	@PostMapping
	public TabEmpresa save(@RequestBody TabEmpresa empresa) {
		TabEmpresa empresaSalvar = repository.save(empresa);
		return empresaSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<TabEmpresa> delete(@PathVariable Long id) {
		Optional<TabEmpresa> empresa = null;
		try {
			empresa = repository.findById(id);
			repository.delete(empresa.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return empresa;

	}

	@PutMapping
	public TabEmpresa update(@RequestBody TabEmpresa empresa) {
		try {
			repository.save(empresa);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return empresa;
	}
}
