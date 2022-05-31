package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.TabOperacao;

public interface OperacaoRepository extends JpaRepository<TabOperacao, Long>{

}
