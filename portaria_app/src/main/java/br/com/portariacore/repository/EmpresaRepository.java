package br.com.portariacore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portariacore.model.TabEmpresa;

public interface EmpresaRepository extends JpaRepository<TabEmpresa, Long>{

}
