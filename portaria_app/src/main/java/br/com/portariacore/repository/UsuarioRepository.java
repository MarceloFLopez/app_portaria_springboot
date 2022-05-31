package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
