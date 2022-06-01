package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.TabCadastro;

public interface CadastroRepository extends JpaRepository<TabCadastro, Long>{

}
