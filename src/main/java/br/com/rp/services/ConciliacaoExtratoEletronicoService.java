package br.com.rp.services;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class ConciliacaoExtratoEletronicoService {
	@Schedule(dayOfMonth = "25")
	public void conciliarExtratoEletronico() {
		System.out.println("Processando...");
	}
}
