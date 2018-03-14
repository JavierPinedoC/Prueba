import java.util.Scanner;

public class ayb{

	public static void main (String args[]){

//Declaración de variables
		double a,b,c;
		String avisos;

//Lectura de variables
		a = leedouble("Dame el valor de a: ");
		b = leedouble("Dame el valor de b: ");
		c = leedouble("Dame el valor de c: ");

		if (a != b && a != c && b != c){

			avisos = mayor3(a,b,c);

			//Imprimir Variables
			System.out.println();	
			System.out.println(avisos);
		}

//Solución del problema
			
		else {
			System.out.println();
			System.out.println("Error los datos deben ser diferentes");
		}
}	

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
}



public static String mayor3(double a, double b, double c){
	String aviso;

			if (a > b)
				if (a > c)
					aviso = "El mayor es A";
				else 
					aviso = "El mayor es C";
			
			else
				if (b > c)
					aviso = "El mayor es B";
				else
					aviso = "El mayor es C";
			
		return aviso;		

		}
}

