
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
public class TabCadastro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn
	private TabEmpresa empresa;

	@ManyToOne
	@JoinColumn
	private TabOperacao operacao;

	@ManyToOne
	@JoinColumn
	private TabTransporte transporte;

	@ManyToOne
	@JoinColumn
	private TabPessoa pessoa;

	public TabCadastro(Long id, TabEmpresa empresa, TabOperacao operacao, TabTransporte transporte, TabPessoa pessoa) {
		this.id = id;
		this.empresa = empresa;
		this.operacao = operacao;
		this.transporte = transporte;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TabEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(TabEmpresa empresa) {
		this.empresa = empresa;
	}

	public TabOperacao getOperacao() {
		return operacao;
	}

	public void setOperacao(TabOperacao operacao) {
		this.operacao = operacao;
	}

	public TabTransporte getTransporte() {
		return transporte;
	}

	public void setTransporte(TabTransporte transporte) {
		this.transporte = transporte;
	}

	public TabPessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(TabPessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "TabCadastro [id=" + id + ", empresa=" + empresa + ", operacao=" + operacao + ", transporte="
				+ transporte + ", pessoa=" + pessoa + "]";
	}

}
