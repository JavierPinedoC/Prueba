import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) { 

		int numero, opcion;
		long factorial;
		boolean seguir;
		seguir = true;
		numero = 0;

		do{
		System.out.println();
		menu();
		System.out.println();
		opcion = leeOpcion("Que opcion quieres: ", 4);
		
		if (opcion != 4)
			numero = leeEntero("Numero a calcular el factorial es: ");

		switch(opcion){
			case(1):{
				factorial = calculaFactorial(numero);
				System.out.println("El factorial de " + numero + " con el metodo 1 es: " + factorial);
				break;
			}

			case(2):{
				factorial = calculaFactorial(numero);
				System.out.println("El factorial de " + numero + " con el metdo 2 es: " + factorial);
				break;
			}
			case(3):{
				factorial = calculaFactorial(numero);
				System.out.println("El factorial de " + numero + " con el metodo 3 es: " + factorial);
				break;
			}

			case(4):{
				seguir = false;
				break;
			}
		}
	}
	while(seguir);
	
//Fin de main
	}

public static void menu(){

		System.out.println("1. Primer metodo del factorial");
		System.out.println("2. Segundo metodo del factorial");
		System.out.println("3. Tercero metodo del factorial");
		System.out.println("4. Cuarto metodo del factorial");
	}

	public static long calculaFactorial(int numero) {

		int veces, multiplica;
		long factorial;

		veces = 0;
		factorial = 1;
		multiplica = 1;

		while (veces < numero) {

			factorial = factorial * multiplica;
			multiplica = multiplica +1;
			veces = veces + 1;

		//Fin de while
		}

		return factorial;

	//Fin de calculaFactorial
	}

	public static int leeEntero(String letrero) {

		int variable;
		Scanner s;

	do {
		System.out.print(letrero);
		s = new Scanner(System.in);
		variable = s.nextInt();

		if(variable < 0){
			System.out.println("El numero es negativo, proporciona un numero positivo");
			System.out.println();}

	} while (variable < 0);

		return variable;


	}

	public static int leeOpcion(String letrero, int terminar) {

		int variable;
		Scanner s;
		variable = 0;

	do {
		System.out.print(letrero);
		s = new Scanner(System.in);
		variable = s.nextInt();

		if(variable < 1 || variable > terminar){
			System.out.println("Opcion invalida");
			System.out.println();}

	} while (variable < 1 || variable > terminar);

	return variable;


	}

//Fin de factorial
}