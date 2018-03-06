//librerias
import java.util.Scanner;

//clase principal
public class PrismaRectangular{

public static void main(String args[]){

//Declaración de variables
	double a, b, c;
	double resultado;

// Lectura de Variables
	a = leedouble("Dame el valor del lado A: "); 
	b = leedouble("Dame el valor del lado B: ");
	c = leedouble("Dame el valor del lado C: ");
	

//Solucion del problema
	resultado = mPrisma(a, b, c);
//presentacion de resultados
	System.out.println();
	System.out.println("El volumen del Prisma es: " + resultado);
	
	
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

public static double mPrisma(double a, double b, double c){

	double vol;

	vol = a * b * c;
	
	return vol;


//Fin de mPrisma
}

//Fin del class	
}