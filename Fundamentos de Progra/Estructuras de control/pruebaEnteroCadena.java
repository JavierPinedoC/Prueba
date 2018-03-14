import java.util.Scanner;

public class pruebaEnteroCadena{

	public static void main(String args[]){

		int n, n2, veces, opera;
		String nCadena, numerosC;

		numerosC = "";
		veces = 0;
		n = leeEntero("valor del numero: ");

		while (veces < n ){
	
			opera = division(n);
			nCadena = enteroAcadena(opera);
			veces = veces++;
			numerosC = numerosC + nCadena + " ";
		}

		System.out.println("Los numeros son: " + numerosC);

	}

	public static int leeEntero(String letrero){
		int valor;
		Scanner s;
		
		s = new Scanner(System.in);
		System.out.print(letrero);
		valor = s.nextInt();

	return valor;
	}

public static String enteroAcadena(int variable){

	String resultado;
	StringBuilder n;

	n = new StringBuilder();
	n.append("");
	n.append(variable);
	resultado = n.toString();

	return resultado;
}

public static int division(int variable){

		int num, num2;
		num2 = 
				
		num = variable % num2;		

		return num;
}

}