//librerias
import java.util.Scanner;

//clase principal
public class ConvertidordeMonedas{

public static void main(String args[]){

//Declaración de variables
	double nMConve, equival;
	double resp;
	String nMonOri, nMonDes;

// Lectura de Variables
	nMonOri = leeString("Nombre de moneda origen es: "); 
	nMConve = leedouble("Dame el monto a convertir: ");
	nMonDes = leeString("Nombre de moneda de destino es: ");
	equival = leedouble("Dame la equivalencia de conversion de la moneda origen a la moneda de destino: ");

//Solucion del problema
	resp = conversiondemoneda(nMConve, equival);

//presentacion de resultados
	System.out.println();
	System.out.println("El nombre de la moneda origen que ingrsaste es: " + nMonOri);
	System.out.println("Monto ingresado de la moneda origen fue de: " + nMConve + " " + nMonOri);
	System.out.println("El nombre de la moneda de destino que ingresaste es: " + nMonDes);
	System.out.println();
	System.out.println("Conversion de " + nMonOri + " a " + nMonDes + " es de: " + resp + " " + nMonDes);

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

public static String leeString(String letrero){
	String n;
	Scanner lector;

	lector = new Scanner(System.in);
	System.out.print(letrero);
	n = lector.nextLine();

	return n;

//fin del leeDouble	
}

public static double conversiondemoneda(double nMConve, double equival){

	double monto;

	monto = nMConve * equival;

	return monto;


//Fin de distanciadosP
}

//Fin del class	
}