package br.com.rp.repository.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import br.com.rp.AbstractTest;
import br.com.rp.services.EstadoService;

public class EstadosRepositoryTest extends AbstractTest{
	@Inject
	private EstadoService estadoService;
	private String pathPadrao = "d://estados.txt";
	
	@Test
	public void validarEstadoParana() throws Throwable {
		assertTrue(new File(pathPadrao).exists());
		List<String> arquivo = estadoService.getEstados();
		assertEquals("PR", arquivo.stream().filter(x -> x.equals("PR")).toString());
	}
}
