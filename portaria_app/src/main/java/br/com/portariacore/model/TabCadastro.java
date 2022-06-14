
package br.com.portariacore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
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

	public TabCadastro(Long id, TabEmpresa empresa, TabOperacao operacao, TabTransporte transporte, TabPessoa pessoa) {
		this.id = id;
		this.empresa = empresa;
		this.operacao = operacao;
		this.transporte = transporte;
		this.pessoa = pessoa;
	}
}
