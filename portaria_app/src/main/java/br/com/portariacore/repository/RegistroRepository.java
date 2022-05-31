package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.WRegistro;

public interface RegistroRepository extends JpaRepository<WRegistro, Long>{

}
