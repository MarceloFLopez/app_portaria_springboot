package br.com.portariacore.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_wregistro")
@AllArgsConstructor
@NoArgsConstructor
public class WRegistro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime date = LocalDateTime.now();

	@ManyToOne
	private Usuario usuario;

	@ManyToOne
	private TabCadastro cadastro;

	public WRegistro(Long id, LocalDateTime date, Usuario usuario, TabCadastro cadastro) {
		this.id = id;
		this.date = date;
		this.usuario = usuario;
		this.cadastro = cadastro;
	}

	public WRegistro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TabCadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(TabCadastro cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "WRegistro [id=" + id + ", date=" + date + ", usuario=" + usuario + ", cadastro=" + cadastro + "]";
	}

	
}
