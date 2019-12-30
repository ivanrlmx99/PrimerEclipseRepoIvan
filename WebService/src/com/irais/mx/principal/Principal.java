package com.irais.mx.principal;

import javax.xml.ws.Endpoint;


import com.irais.mx.impl.CalculadoraImpl;

public class Principal {

	public static void main(String[] args) {
		// TAquí van los comentarios del codigo 
		Endpoint.publish("http://localhost:1523/ws/ivanmx",new CalculadoraImpl());
		
		
	}

}
