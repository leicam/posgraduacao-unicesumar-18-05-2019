package br.com.rp.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Startup;
import javax.ejb.Stateless;

import br.com.rp.domain.Estado;
import br.com.rp.repository.IEstadoRepository;

@Stateless
@Startup
public class EstadoRepository extends AbstractRepositoryImpl<Estado> implements IEstadoRepository{
	private List<Estado> estados = new ArrayList<Estado>();
	
	public EstadoRepository() {
		super(Estado.class);
	}

	@Override
	public List<Estado> getEstados() {
		estados.add(new Estado("PR", "Paraná"));
		estados.add(new Estado("SP", "São Paulo"));
		
		return estados;
	}
}
