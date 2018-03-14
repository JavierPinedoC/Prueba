//librerias
import java.util.Scanner;

//clase principal
public class aInvertir{

public static void main(String args[]){

//Declaración de variables
	double i, r, t;
	double resultado;

// Lectura de Variables
	i = leedouble("Dame el Ingreso: "); 
	r = leedouble("Dame la taza de interes: ");
	t = leedouble("Dame el tiempo en años: ");
	
	
//Solucion del problema
	resultado = viInver(i,r,t);

//presentacion de resultados
	System.out.println();
	System.out.println("Monto a invertir es de: " + resultado);
	
	
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

public static double viInver(double i, double r, double t){

	double vi;

	vi = i/(r * t);
	
	return vi;


//Fin de vEsfera
}

//Fin del class	
}