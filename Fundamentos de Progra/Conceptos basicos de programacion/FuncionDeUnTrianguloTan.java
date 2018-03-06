//Librerias

import java.util.Scanner;

//Nombre del Programa

public class FuncionDeUnTrianguloTan {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double grados,a,b;
	Double radianes;
	Scanner x1;

// inicio de variables

		radianes = 0.0;
		b = 0.0;

//lectura de variables

	System.out.print("Valor del Angulo en Grados: ");
		x1 = new Scanner(System.in);
		grados = x1.nextDouble();

	System.out.print("Valor del cateto adyacente a: ");
		x1 = new Scanner(System.in);
		a = x1.nextDouble();

//Solución del problema, convertir de grados a Radianes

		radianes = (Math.PI*grados) / 180;
		b = (a * Math.tan(radianes));


//Imprimir Resultados

	System.out.println("El valor del cateto adyacente es: " + a);
	System.out.println("El valor del angulo en grados es: " + grados);
	System.out.println("El valor del angulo en radianes es: " + radianes);
	System.out.println("El valor del cateto opuesto es: " + b);
	

	}
}