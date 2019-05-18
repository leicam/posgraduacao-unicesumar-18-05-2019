package br.com.rp.repository;

import java.util.List;

import br.com.rp.domain.Pessoa;

public interface IPessoaRepository extends Repository<Pessoa>{
	List<Pessoa> buscarPessoaPorNome(String nome);
}
