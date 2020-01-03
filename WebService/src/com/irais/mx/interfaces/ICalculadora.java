package com.irais.mx.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface ICalculadora {

	@WebMethod
	public int operacionesBasicas(int opcion,int valor1,int valor2);
	
	@WebMethod
	public int potenciaTres(int a);
	
	
	
}
