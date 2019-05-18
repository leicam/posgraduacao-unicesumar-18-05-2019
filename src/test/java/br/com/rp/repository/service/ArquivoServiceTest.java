package br.com.rp.repository.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.inject.Inject;

import br.com.rp.AbstractTest;
import br.com.rp.services.ArquivoService;

public class ArquivoServiceTest extends AbstractTest{
	@Inject
	private ArquivoService arquivoService;
	private String pathPadrao = "d://dados.txt";
	
	public void salvarArquivo() throws Throwable {		
		Files.deleteIfExists(Paths.get(pathPadrao));
		arquivoService.salvar("Juliano");
		
		assertTrue(new File(pathPadrao).exists());
		String arquivo = new String(Files.readAllBytes(Paths.get(pathPadrao)));
		assertEquals("Juliano", arquivo);
	}
}
