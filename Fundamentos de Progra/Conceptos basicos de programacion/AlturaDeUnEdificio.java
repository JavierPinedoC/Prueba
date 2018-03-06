//Librerias

import java.util.Scanner;

//Nombre del Programa

public class AlturaDeUnEdificio {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double grados,p,d,hE, hEF;
	Double radianes;
	Scanner x1;

// inicio de variables

		radianes = 0.0;
		hE = 0.0;
		hEF = 0.0;

//lectura de variables

	x1 = new Scanner(System.in);

	System.out.print("Valor del Angulo en Grados: ");
		grados = x1.nextDouble();

	System.out.print("Dame la distancia en metros de la persona al edificio: ");
		d = x1.nextDouble();

	System.out.print("Dame la altura de la persona en metros: ");
		p = x1.nextDouble();

//Solución del problema, convertir de grados a Radianes

		radianes = (Math.PI*grados) / 180;
		hE = (d * Math.tan(radianes));
		hEF = (hE + p);


//Imprimir Resultados

	System.out.println("La altura del edificio es: " + hEF);
	
	}
}