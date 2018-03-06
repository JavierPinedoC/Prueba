//librerias
import java.util.Scanner;

//clase principal
public class volEsfera{

public static void main(String args[]){

//Declaración de variables
	double r;
	double resultado;

// Lectura de Variables
	r = leedouble("Dame el valor del radio : "); 
	
//Solucion del problema
	resultado = vEsfera(r);

//presentacion de resultados
	System.out.println();
	System.out.println("El volumen de la esfera es: " + resultado);
	
	
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

public static double vEsfera(double r){

	double vol;

	vol = ((4 * Math.PI)/3) * Math.pow(r,3);
	
	return vol;


//Fin de vEsfera
}

//Fin del class	
}