package br.com.rp.services;

import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
@Asynchronous
public class CalculadoraService {
	
	public Future<Double> somar(Double a, Double b) throws Throwable {
		return new AsyncResult<Double>(a + b);
	}

	public Future<Double> media(Double a, Double b) throws Throwable {
		return new AsyncResult<Double>(a / b);
	}
}
