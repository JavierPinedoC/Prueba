import java.util.Scanner;

public class Divisores{
	
	public static void main(String args[]) {

		int n, veces, num2, divisores, di;
		String nCadena, numerosC;

		numerosC = "";
		veces = 0;
		num2 = 1;
		n = leeEntero("valor del numero: ");
		
		do{	
			if(n % num2 == 0){
			nCadena = enteroAcadena(num2);
			numerosC = (numerosC + nCadena + " ");}
			num2 = num2 + 1;
		
		}while(num2 <= n);

		System.out.println("Los numeros son: " + numerosC);

}

	public static String enteroAcadena(int variable) {
		
		String resultado;
		StringBuilder n;
		
		n = new StringBuilder();
		n.append("");
		n.append(variable);
		resultado = n.toString();
		
		return resultado;
		
	}

	public static int leeEntero(String letrero) {

		int variable;
		Scanner s;

		variable = 0;

		do {

			System.out.print(letrero);
			s = new Scanner(System.in);
			variable = s.nextInt();

			if (variable < 0)
				System.out.println("El numero es negativo, proporciona un numero positivo");

		} while (variable < 0);

		return variable;

	}

}
