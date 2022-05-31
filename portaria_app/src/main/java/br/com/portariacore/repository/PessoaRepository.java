package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.TabPessoa;

public interface PessoaRepository extends JpaRepository<TabPessoa, Long>{

}
