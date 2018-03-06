//Librerias

import java.util.Scanner;

//Nombre del Programa

public class NumeroDuplicado {

//Programa Principal

	public static void main(String args []){

//Declaracion de Variables

	Double numero, nduplicado;
	Scanner s;

//Lectura de Variables

	System.out.print("Valor del Numero: ");
		s = new Scanner(System.in);
		numero = s.nextDouble();

// Solución del problema duplicar el numero

		nduplicado = numero + numero;

// Imprimir resultados

		System.out.println("El valor guardado en numero es: " + numero + " numero duplicado: " + nduplicado);


	}

	 
}