package br.com.rp.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.ejb.Stateless;

@Stateless
public class ArquivoService {
	private String pathPadrao = "d://dados.txt";
	
	public void salvar(String dados) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pathPadrao)));
			bw.write(dados);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
