import java.util.Scanner;

public class FactoresPrimos{
	
	public static void main(String args[]) {

		int numero, factor, n;
		String nCadena, numerosC;
		factor = 0;
		numerosC = "";
		numero = leeEntero("valor del numero: ");
		n = numero;
		
		do{	
			if(numero % 2 == 0){
			factor = 2;
			numero = numero / 2 ;
			}
			else if(numero % 3 == 0){
			factor = 3;
			numero = numero / 3 ;
			}
			else if(numero % 5 == 0){
			factor = 5;
			numero = numero / 5 ;
			}
			else if(numero % 7 == 0){
			factor = 7;
			numero = numero / 7 ;
			}
			else if(numero % 11 == 0){
			factor = 11;
			numero = numero / 11 ;
			}
			else
				{factor = numero;
				numero = numero/factor;}
					
		nCadena = enteroAcadena(factor);
		numerosC = (numerosC + nCadena + " x ");
		}while(numero > 1);

		System.out.println("Los numeros primos de " + n + " son: " + numerosC + "1");

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
