package br.com.rp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class EmprestarLivro extends BaseEntity{
	private Pessoa pessoa;
	private List<Livro> livros;
	
	public EmprestarLivro() {
		
	}
	
	public EmprestarLivro(Pessoa pessoa) {
		this.pessoa = pessoa;
		livros = new ArrayList<Livro>();
	}
	
	public void adicionarLivrosParaEmprestimo(List<Livro> livros) {
		if(livros.size() > 3)
			throw new IllegalArgumentException("Quantidade de livros não permitida para emprestimo");
		
		livros.stream().forEach(x -> {adicionarLivro(x);});
	}
	
	private void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
}
