package com.irais.mx.impl;

import javax.jws.WebService;

import com.irais.mx.interfaces.ICalculadora;

@WebService

public class CalculadoraImpl implements ICalculadora {

	int resultado = 0;

	@Override
	public int operacionesBasicas(int opcion, int valor1, int valor2) {

		switch (opcion) {
		case 1:

			resultado = valor1 + valor2;
			break;

		case 2:
			resultado = valor1 - valor2;
			break;

		case 3:
			resultado = valor1 * valor2;

		default:
			break;
		}
		return resultado;
	}

	@Override
	public int potenciaTres(int a) {
		// TODO Auto-generated method stub
		int potencia=a*a*a;
		return potencia;
	}

	

}
