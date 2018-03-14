//librerias
import java.util.Scanner;

//clase principal
public class dDosPuntosMetodos{

public static void main(String args[]){

//Declaración de variables
	double dosPx1, dosPx2, dosPy1, dosPy2;
	double resp;

// Lectura de Variables
	dosPx1 = leedouble("Dame el punto x1: "); 
	dosPx2 = leedouble("Dame el punto x2: ");
	dosPy1 = leedouble("Dame el punto y1: ");
	dosPy2 = leedouble("Dame el punto y2: ");

//Solucion del problema
	resp = distanciadosP(dosPx1, dosPx2, dosPy1, dosPy2);

//presentacion de resultados
	System.out.println("La distancia entre los puntos es: " + resp);

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

public static double distanciadosP(double dosPx1, double dosPx2, double dosPy1, double dosPy2){

	double dist;

	dist = Math.sqrt(Math.pow((dosPx2 - dosPx1),2) + Math.pow((dosPy2 - dosPy1),2));

	return dist;


//Fin de distanciadosP
}

//Fin del class	
}