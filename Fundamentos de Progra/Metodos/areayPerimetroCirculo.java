// Librerias
import java.util.Scanner;

// Clase principal
public class areayPerimetroCirculo{

// programa Principal
public static void main(String args []){

//Declaraciion de variables	
	double p, a;
	double radio;

//Lectura de Variables
	 radio = leeDouble("Dame el radio del circulo: ");

// Solucion del numero al cuadrado	
	a = areadelcirculo(radio);
	p = perimetrodelcirculo(radio);

// Imprimir resultados
	System.out.println("El area es: " + a);
	System.out.println("El perimetro del circulo es: " + p);

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
 
public static double areadelcirculo(double radio){

	double are;

	are = Math.PI * Math.pow(radio,2);

	 return are;

// Fina del area
}

public static double perimetrodelcirculo(double radio){

	double per;

	per = Math.PI * (2*radio);

	return per;


// fin del perimetro
}

//Fin del Class	
}

	