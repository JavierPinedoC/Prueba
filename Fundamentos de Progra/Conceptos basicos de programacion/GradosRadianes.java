//Librerias

import java.util.Scanner;

//Nombre del Programa

public class GradosRadianes {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double grados;
	Double radianes;
	Scanner x1;

// inicio de variables

		radianes = 0.0;

//lectura de variables

	System.out.print("Valor del Angulo en Grados: ");
		x1 = new Scanner(System.in);
		grados = x1.nextDouble();

//Solución del problema, convertir de grados a Radianes

		radianes = (Math.PI*grados) / 180;

//Imprimir Resultados

	System.out.println("El angulo en grados " + grados + " equivale en radianes a " + radianes);

	}
}