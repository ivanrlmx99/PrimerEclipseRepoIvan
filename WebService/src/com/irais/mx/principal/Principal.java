package com.irais.mx.principal;

import javax.xml.ws.Endpoint;


import com.irais.mx.impl.CalculadoraImpl;

public class Principal {

	public static void main(String[] args) {
		// TAqu� van los comentarios del codigo 
		Endpoint.publish("http://localhost:1523/ws/ivanmx",new CalculadoraImpl());
<<<<<<< HEAD
		//Con esta anotacion se muestra en la url del navegador el web services 
		
		
=======
		
		System.out.printl("Agregué este comentario desde la pagina de git desde internet....");
>>>>>>> branch 'master' of https://github.com/ivanrlmx99/PrimerEclipseRepoIvan.git
	}

}
