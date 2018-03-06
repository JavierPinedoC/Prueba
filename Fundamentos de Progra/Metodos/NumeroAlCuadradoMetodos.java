// Librerias
import java.util.Scanner;

// Clase principal
public class NumeroAlCuadradoMetodos{

// programa Principal
public static void main(String args []){

//Declaraciion de variables	
	double nC, numero;

//Lectura de Variables
	numero = leeDouble("Dame un numero: ");

// Solucion del numero al cuadrado	
	nC = numeroAlCuadrado(numero);

// Imprimir resultados
	System.out.println("Tu numero al cuadrado es: " + nC);

//Fin del main	
	}

public static double leeDouble(String letrero){

		Scanner s;
		double valor;

		s = new Scanner(System.in);
		System.out.print(letrero);
		valor = s.nextDouble();

		return valor;
// Fin leeDouble
}
 
public static double numeroAlCuadrado(double numero){

	double nCuadraro;

	nCuadraro = Math.pow(numero,2);

	 return nCuadraro;

// Fina del numero al cuadrado	
}

//Fin del Class	
}

	