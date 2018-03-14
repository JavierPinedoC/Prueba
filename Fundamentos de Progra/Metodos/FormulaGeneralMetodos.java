//librerias
import java.util.Scanner;

//clase principal
public class FormulaGeneralMetodos{

public static void main(String args[]){

//Declaración de variables
	double a, b, c;
	double resposi, resnega;

// Lectura de Variables
	a = leedouble("Dame el valor de A: "); 
	b = leedouble("Dame el valor de B: ");
	c = leedouble("Dame el valor de C: ");
	

//Solucion del problema
	resposi = raizformulageneralpositiva(a, b, c);
	resnega = raizformulageneralnegativa(a, b, c);

//presentacion de resultados
	System.out.println();
	System.out.println("La raiz cuadrada positiva es: " + resposi);
	System.out.println("La raiz cuadrada negativa es: " + resnega);
	
// fin del Main
}

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
	

//fin del leeDouble	
}

public static double raizformulageneralpositiva(double a, double b, double c){

	double menosb, discri, divisor, r1;

	menosb = (-1 * b);
	discri = (Math.pow(b,2))-(4*a*c);
	divisor = (2 * a);
	r1 = ((menosb + Math.sqrt(discri)) / divisor);	

	return r1;
	


//Fin de distanciadosP
}

public static double raizformulageneralnegativa(double a, double b, double c){

	double menosb, discri, divisor, r2;

	menosb = (-1 * b);
	discri = (Math.pow(b,2))-(4*a*c);
	divisor = (2 * a);
	r2 = ((menosb - Math.sqrt(discri)) / divisor);
	
	return r2;


//Fin de distanciadosP
}

//Fin del class	
}