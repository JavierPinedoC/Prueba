import java.util.Scanner;

public class Dinero{

	public static void main (String args[]){

		double saldo, costo;
		String aviso;

		saldo = leedouble("Saldo en el banco: ");
		costo = leedouble("Costo del articulo: ");

		if (saldo >= costo)
			aviso = "Si me alcanza";
		else
			aviso = "No puedo";

		System.out.println();	
		System.out.println(aviso);
	}

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
	}
}