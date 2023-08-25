package br.com.portariacore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_empresa", uniqueConstraints = { @UniqueConstraint(columnNames = { "cnpj" }) })
@AllArgsConstructor
@NoArgsConstructor
public class TabEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 13)
	private String cnpj;

	@Column(length = 50)
	private String name;

	public TabEmpresa(Long id, String cnpj, String name) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.name = name;
	}

	public TabEmpresa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TabEmpresa [id=" + id + ", cnpj=" + cnpj + ", name=" + name + "]";
	}
	
	

}
