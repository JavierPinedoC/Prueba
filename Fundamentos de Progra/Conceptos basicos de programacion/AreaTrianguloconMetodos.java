//Librerias

import java.util.Scanner;

//Nombre del Programa

public class AreaTrianguloconMetodos {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double b,h;
	Double a;

	b = leeDouble("Dame la base: ");
	h = leeDouble("Dame la altura: ");

	a = area(b,h);

	System.out.println("El area del triangulo es: " + a);

//fin del main
	}


// metodo 	ue calcula el area
	public static double area(double b, double h){	

// declaracion de variables
		double a;

// inicio de variables

		a = 0.0;

//Calculo del area

		a = (b * h) / 2;

//Regresar variable
		return a;


// fin del metodo area
	}

//metddo para leer un valor double

	public static double leeDouble(String letrero){	

		double valor;
		Scanner s;

		s = new Scanner(System.in);

		System.out.print(letrero);
		valor = s.nextDouble();

		return valor;
	// fin metodo leeDouble
	}

	// din de class AreaTriangulo
}
