// Libreriaas
import java.util.Scanner;

// clase principal
public class AvionMetodos{

// programa principal		
	public static void main (String args[]){

//declaracion de variables
		double hAvion, hTorreControl, dHorizontal;
		double dReal, aVision;

// Lectura de Variables
		hAvion = leeDouble("Altura a la que vuela el avion: ");
		hTorreControl = leeDouble("Altura de la torre de control: ");
		dHorizontal = leeDouble("Dinstancia horizontal del avion a la torre de control: ");

// Solucion del Problema
		dReal = distanciaReal(hAvion, hTorreControl, dHorizontal);
		aVision = calculaAngulo(hAvion, hTorreControl, dHorizontal);

// presentacion de resultados
		System.out.println("La distancia real del avion a la cima de la torre de control es: " + dReal);
		System.out.println("El angulo de vision es: " + aVision);

// Fin del main
	}

	public static double leeDouble(String letrero){

		Scanner s;
		double valor;

		s = new Scanner(System.in);
		System.out.print(letrero);
		valor = s.nextDouble();

		return valor;


//fin leeDouble
	}

	public static double distanciaReal(double hAvion, double hTorreControl, double d){

		double co, ca, h;


		co = hAvion - hTorreControl;
		ca = d;

		h = Math.sqrt(Math.pow(co,2) + Math.pow(ca,2));

		return h;

//fin distancia Real		
	}

	public static double calculaAngulo(double hAvion, double hTorreControl, double d){

		double co, ca, aG, aR;

		co = hAvion - hTorreControl;
		ca = d;

		aR = Math.atan(co/ca);
		aG =(aR * 180)/ Math.PI;

		return aG;

//fin calcular angulo		
	}

//fin class	
}