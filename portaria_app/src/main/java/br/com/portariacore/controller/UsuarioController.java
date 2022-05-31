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

import br.com.portariacore.model.Usuario;
import br.com.portariacore.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@RequestMapping("listar")
	public List<Usuario> listAll() {
		List<Usuario> usuarios = repository.findAll();
		return usuarios;
	}

	@GetMapping
	@RequestMapping("buscarId/{id}")
	public Optional<Usuario> findId(@PathVariable Long id) {
		Optional<Usuario> usuario = repository.findById(id);
		return usuario;
	}

	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		Usuario usuarioSalvar = repository.save(usuario);
		return usuarioSalvar;
	}

	@DeleteMapping("delete/{id}")
	public Optional<Usuario> delete(@PathVariable Long id) {
		Optional<Usuario> usuario = null;
		try {
			usuario = repository.findById(id);
			repository.delete(usuario.get());
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return usuario;
	}

	@PutMapping
	public Usuario update(@RequestBody Usuario usuario) {
		try {
			repository.save(usuario);
		} catch (ConstraintViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (DataIntegrityViolationException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return usuario;
	}
}
