package br.com.portariaapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;
	private String cpf;

	public Pessoa(Long id, String nome, LocalDate date, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.date = date;
		this.cpf = cpf;
	}

	public Pessoa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
