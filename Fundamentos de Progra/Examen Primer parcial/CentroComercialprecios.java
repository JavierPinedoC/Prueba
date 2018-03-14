//librerias
import java.util.Scanner;

//clase principal
public class CentroComercialprecios{

public static void main(String args[]){

//Declaración de variables
	double costoSinDescu, costoConDescuen, impuesto;
	String nomPro;
	double porcentajeiva, costoIyD, costoIyR;

// Lectura de Variables
	nomPro = leeString("Nombre del producto: ");
	costoSinDescu = leedouble("Costo real del producto " + nomPro + ": "); 
	costoConDescuen = leedouble("Costo con descuento del producto " + nomPro + ": ");
	impuesto = leedouble("IVA del producto " + nomPro + ": ");
	
	
//Solucion del problema
	porcentajeiva = porcentajeDes(costoSinDescu, costoConDescuen, impuesto);
	costoIyR = costoConIVAsinDes(costoSinDescu, costoConDescuen, impuesto);
	costoIyD = costoConIVAConDescuento(costoSinDescu, costoConDescuen, impuesto);

//presentacion de resultados
	System.out.println();
	System.out.println("El porcentaje de descuento del producto " + nomPro + " es: "+ porcentajeiva);
	System.out.println("El costo del producto " + nomPro + " con iva sin descuento es: " + costoIyR);
	System.out.println("El costo del producto " + nomPro + " con iva con descuento es: " + costoIyD);
	
	
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
	

//fin del leestring
}

public static double porcentajeDes(double costoSinDescu, double costoConDescuen, double impuesto){

	double des, desT;

	des = (costoConDescuen * 100)/(costoSinDescu);
	desT = (100 - des);
	
	return desT;


//Fin de descuento
}

public static double costoConIVAsinDes(double costoSinDescu, double costoConDescuen, double impuesto){

	double costoT;

	costoT = costoSinDescu + (costoSinDescu * (impuesto / 100));
	
	return costoT;


//Fin de Iva + sin descuento
}

public static double costoConIVAConDescuento(double costoSinDescu, double costoConDescuen, double impuesto){

	double costoConDes;

	costoConDes = costoConDescuen + (costoConDescuen * (impuesto / 100));
	
	return costoConDes;


//Fin de Iva + sin descuento
}

//Fin del class	
}