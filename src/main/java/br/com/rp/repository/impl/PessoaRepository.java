package br.com.rp.repository.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.rp.domain.Pessoa;
import br.com.rp.repository.IPessoaRepository;

@Stateless
public class PessoaRepository extends AbstractRepositoryImpl<Pessoa> implements IPessoaRepository{
	public PessoaRepository() {
		super(Pessoa.class);
	}

	@Override
	public List<Pessoa> buscarPessoaPorNome(String nome) {
		TypedQuery<Pessoa> tq = em.createQuery("select p from Pessoa p where nome like :nome", Pessoa.class);
		tq.setParameter("nome", nome + "%");
		return tq.getResultList();
	}
}
