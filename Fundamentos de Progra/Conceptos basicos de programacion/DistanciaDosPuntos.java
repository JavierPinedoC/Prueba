//Librerias

import java.util.Scanner;

//Nombre del Programa

public class DistanciaDosPuntos {

//Programa Principal

	public static void main(String args []){

//Declaracion de Variables

	Double a,b,c,d,dist;
	Scanner x1;
	

// inicio de variables

		dist = 0.0;

//lectura de variables

	System.out.print("Valor del Numero X1: ");
		x1 = new Scanner(System.in);
		a = x1.nextDouble();

	System.out.print("Valor del Numero Y1: ");
		x1 = new Scanner(System.in);
		b = x1.nextDouble();

	System.out.print("Valor del Numero X2: ");
		x1 = new Scanner(System.in);
		c = x1.nextDouble();
	
	System.out.print("Valor del Numero Y2: ");
		x1 = new Scanner(System.in);
		d = x1.nextDouble();

//Solución del problema, encontrar la distancia entre dos puntos

	dist = Math.sqrt(Math.pow((c-a),2) + Math.pow((d-b),2));

//Imprimir Resultados

	System.out.println("La distancia es: " + dist);


	}
}