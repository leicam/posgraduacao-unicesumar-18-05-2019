package br.com.rp.repository;

import java.util.List;

import br.com.rp.domain.Estado;

public interface IEstadoRepository extends Repository<Estado>{
	List<Estado> getEstados();
}
