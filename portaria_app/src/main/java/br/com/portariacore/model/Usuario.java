package br.com.portariacore.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_usuario",uniqueConstraints = { @UniqueConstraint(columnNames = { "login" }) })
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String nome;
	
	@Column(length = 50)
	private String login;
	
	@Column(length = 50)
	private String senha;

	private boolean ativo;
	
	private LocalDateTime date =  LocalDateTime.now();

	
}
