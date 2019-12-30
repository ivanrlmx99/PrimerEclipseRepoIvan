package com.irais.mx.principal;

import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;

import com.irais.mx.impl.CalculadoraImpl;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endpoint.publish("http://localhost:1523/ws/ivanmx",new CalculadoraImpl());
	}

}
