package br.com.rp.domain;

import javax.persistence.Entity;

@Entity
public class Livro extends BaseEntity{

	private String nome;
	private String autor;
	
	public Livro() {
		
	}
	
	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
}
