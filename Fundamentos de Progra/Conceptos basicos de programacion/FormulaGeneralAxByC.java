//Librerias

import java.util.Scanner;

//Nombre del Programa

public class FormulaGeneralAxByC {

//Programa Principal

	public static void main(String args []){

//Declaracion de variables

	Double a,b,c;
	Double r1,r2,discri,divisor,menosb;
	int d,f,l;
	Scanner x1;

// inicio de variables

		discri = 0.0;
		d = 2;
		f = 4;
		l = -1;
		r1 = 0.0;
		r2 = 0.0;

//lectura de variables

	System.out.print("Dame el valor de A: ");
		x1 = new Scanner(System.in);
		a = x1.nextDouble();

	System.out.print("Dame el valor de B: ");
		x1 = new Scanner(System.in);
		b = x1.nextDouble();

	System.out.print("Dame el valor de C: ");
		x1 = new Scanner(System.in);
		c = x1.nextDouble();


//Solución del problema, encontrar el valor de las raices

	menosb = (l * b);
	discri = (Math.pow(b,2))-(f*a*c);
	divisor = (d * a);
	r1 = ((menosb + Math.sqrt(discri)) / divisor);
	r2 = ((menosb - Math.sqrt(discri)) / divisor);

//Imprimir Resultados

	System.out.println("El Resultado con raiz positiva es: " + r1);
	System.out.println("El resultado con raiz negativa es: " + r2);

	}
}