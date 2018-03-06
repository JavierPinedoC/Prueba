//Librerias

import java.util.Scanner;

//Nombre del Programa

public class AreaDeUnTriangulo {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double b,h,are;
	int c;
	Scanner x1;

// inicio de variables

		are = 0.0;
		c = 2;

//lectura de variables

	System.out.print("La base del triangulo: ");
		x1 = new Scanner(System.in);
		b = x1.nextDouble();

	System.out.print("La altura del triangulo: ");
		x1 = new Scanner(System.in);
		h = x1.nextDouble();

//Solución del problema, encontrar el area del triandulo

	are = ((b * h)/c);

//Imprimir Resultados

	System.out.println("El area es: " + are);


	}
}