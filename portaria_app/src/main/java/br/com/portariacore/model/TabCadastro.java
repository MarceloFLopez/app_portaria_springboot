package br.com.portariacore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@Table(name = "tb_cadastro")
@NoArgsConstructor
public class TabCadastro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private TabEmpresa empresa;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TabOperacao operacao;

	@ManyToOne
	@JoinColumn(nullable = false)  
	private TabTransporte transporte;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private TabPessoa pessoa;
	
	public void salvarCadastro(TabEmpresa empresa, TabOperacao operacao, TabTransporte transporte ,TabPessoa pessoa) {
		TabCadastro cadastro = new TabCadastro(id, empresa, operacao, transporte, pessoa);
	}
}
