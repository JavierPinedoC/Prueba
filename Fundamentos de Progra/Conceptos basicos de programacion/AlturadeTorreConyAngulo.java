//Librerias

import java.util.Scanner;

//Nombre del Programa

public class AlturadeTorreConyAngulo {

//Programa Principal

public static void main(String args []){

//Declaracion de variables

	Double anRad,d,hTorredeCon, hAvion, dReal;
	Double angulo, cateOp;
	Scanner x1;

// inicio de variables

		dReal = 0.0;
		angulo = 0.0;
		anRad = 0.0;
		cateOp = 0.0;

//lectura de variables

	x1 = new Scanner(System.in);

	System.out.print("Dame la altura en metros de la torre al avion horizontalmente: ");
		d = x1.nextDouble();

	System.out.print("Dame la altura en metros del suelo al avion: ");
		hAvion = x1.nextDouble();

	System.out.print("Dame la altura de la torre en metros: ");
		hTorredeCon = x1.nextDouble();

//Solución del problema, sacar la distancia de la torre al avion y el angulo

		cateOp = hAvion - hTorredeCon;
		dReal = Math.sqrt((Math.pow(d,2))+(Math.pow(cateOp,2)));
		anRad = (Math.atan(cateOp / d));
		angulo = (180*anRad) / Math.PI;

//Imprimir Resultados

	System.out.println("La distancia de la Torre de Control al Avion es: " + dReal);
	System.out.println("El angulo de la Torre de Control al Avion es: " + angulo);
	}
}