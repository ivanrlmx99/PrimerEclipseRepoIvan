package com.irais.mx.principal;

import javax.xml.ws.Endpoint;


import com.irais.mx.impl.CalculadoraImpl;

public class Principal {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1513/ws/ivanmx",new CalculadoraImpl());

		
		

	}

}
