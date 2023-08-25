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
@Table(name = "tb_transporte", uniqueConstraints = { @UniqueConstraint(columnNames = { "placa" }) })
@NoArgsConstructor
@AllArgsConstructor
public class TabTransporte implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String modelo;

	private String placa;

	public TabTransporte(Long id, String modelo, String placa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
	}

	public TabTransporte() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "TabTransporte [id=" + id + ", modelo=" + modelo + ", placa=" + placa + "]";
	}
	
	

}
