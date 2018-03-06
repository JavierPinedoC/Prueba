//librerias

import java.util.Scanner;

//Nombre del Programa

public class numero_al_cuadrado {

//Nombre Principal

	public static void main(String args []){

//Declaración de variables

		Double numero, ncuadrado;
		Scanner s;

// Lectura de Variables

		System.out.print("Valor del Numero: ");
		s = new Scanner(System.in);
		numero = s.nextDouble();

// Solución del problema elevar el numero al cuadrado

		ncuadrado = Math.pow(numero,2);

// Imprimir resultados

		System.out.println("El valor guardado en numero es: " + numero + " Elevado al cuadrado es: " + ncuadrado);

	}


}