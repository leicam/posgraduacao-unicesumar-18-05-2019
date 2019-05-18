package br.com.rp.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import br.com.rp.domain.Estado;
import br.com.rp.repository.impl.EstadoRepository;

@Singleton
@Startup
public class EstadoService {
	@Inject
	private EstadoRepository repository;
	private List<Estado> estados;
	
	@PostConstruct
	private void carregarEstados() {
		estados = repository.getEstados();
	}
	
	@Lock(LockType.READ)
	public List<String> getEstados() throws Throwable{
		return estados.stream()
				   .map((x -> x.toString()))
				   .collect(Collectors.toList());
	}
}
