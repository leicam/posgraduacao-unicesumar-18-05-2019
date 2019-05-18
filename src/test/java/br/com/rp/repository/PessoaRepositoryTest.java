package br.com.rp.repository;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.ejb.EJB;

import org.jboss.arquillian.persistence.UsingDataSet;
import org.junit.Test;

import br.com.rp.AbstractTest;
import br.com.rp.domain.Pessoa;

public class PessoaRepositoryTest extends AbstractTest {
	@EJB
	private IPessoaRepository pessoaRepository;
	private List<Pessoa> lista;
	
	@Test
	public void salvar() {
		Pessoa pessoa1 = new Pessoa("Juliano", 25);
		
		pessoaRepository.save(pessoa1);
		lista = pessoaRepository.getAll();
		assertTrue(lista.size() > 0);
	}
	
	@Test
	@UsingDataSet("db/pessoa.xml")
	public void buscarListaDePessoasPorNome() {
		lista = pessoaRepository.buscarPessoaPorNome("Moni");
		assertTrue(lista.size() > 0);
	}
}
