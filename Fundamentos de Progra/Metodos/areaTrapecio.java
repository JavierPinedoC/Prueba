//librerias
import java.util.Scanner;

//clase principal
public class areaTrapecio{

public static void main(String args[]){

//Declaración de variables
	double angulo, hip, b1, b2;
	double resultado;

// Lectura de Variables
	angulo = leedouble("Dame el valor del angulo: "); 
	hip = leedouble ("Dame el valor de hipotenusa: ");
	b1 = leedouble("Dame el valor b1");
	b2 = leedouble("Dame el valor b2");
	
//Solucion del problema
	resultado = aTrapecio(angulo, hip, b1, b2);

//presentacion de resultados
	System.out.println();
	System.out.println("El area del trapecio es: " + resultado);
	
	
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

public static double aTrapecio(double angulo, double hip, double b1, double b2){

	double area, h;

	h = Math.SEN(angulo) * hip;
	area = (((b1 + b2)/2) * h);
	
	return are;


//Fin de vEsfera
}

//Fin del class	
}