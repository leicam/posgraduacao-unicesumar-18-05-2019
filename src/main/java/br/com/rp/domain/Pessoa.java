package br.com.rp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Pessoa extends BaseEntity{
	@NotNull
	@Column(name = "NOME", length=100, nullable=false)
	private String nome;
	@Column(name = "IDADE")
	private int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
