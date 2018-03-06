import java.util.Scanner;

public class Sumatorias{
	
	public static void main(String args[]) {

		int n,c, opcion;
		double suma;
		boolean seguir;
		seguir = true;

		do{

			menu();
			System.out.println();
			opcion = leeOpcion("Que opcion deseas probar: ", 4);

			switch(opcion){

				case (1): {

					c = leeEntero("numero a sumar: ");
					n = leeEntero("numero de veces: ");
					suma = suma_1(n,c);
					System.out.println("El valor de la suma 1 es: " + suma);
					break;
				}

				case(2): {

					n = leeEntero("numero de veces: ");
					suma = suma_2(n);
					System.out.println("El valor de la suma 2 es: " + suma);
					break;
				}

				case(3): {

					n = leeEntero("numero de veces: ");
					suma = suma_3(n);
					System.out.println("El valor de la suma 2 es: " + suma);
					break;
				}

				case(4): {

					seguir = false;
					break;
				}
			}

		} while(seguir);		
		
}

	public static int leeOpcion(String letrero, int numOpciones) {

		int variable;
		Scanner s;

		variable = 0;

		do {

			System.out.print(letrero);
			s = new Scanner(System.in);
			variable = s.nextInt();

		} while (variable < 1 || variable > numOpciones);

		return variable;

	}

	public static int leeEntero(String letrero){

		int variable;
		Scanner s;

		variable = 0;

		do {

			System.out.print(letrero);
			s = new Scanner(System.in);
			variable = s.nextInt();

			if (variable < 0)
				System.out.println("El numero es negativo, proporciona un numero positivo");

		} while (variable < 1 );

		return variable;

	}

	public static double suma_1(int n, int c){

		int i;
		double suma;

		suma = 0;
		i = 1;

		while(i<=n){

			suma = suma + c;
			i = i +1;
		}
	return suma;
	}

	public static double suma_2(int n){

		int i;
		double suma;

		suma = 0;
		i = 1;

		while(i<=n){

			suma = suma + i;
			i = i +1;
		}
	return suma;
	}

	public static double suma_3(int n){

		int i;
		double suma;

		suma = 0;
		i = 1;

		while(i<=n){

			suma = suma + Math.pow(i,2);
			i = i +1;
		}
	return suma;
	}

	public static void menu(){
		System.out.println();
		System.out.println("1. Utilizar el metodo suma 1, c");
		System.out.println("2. Utilizar el metodo suma 2, i");
		System.out.println("3. Utilizar el metodo suma 3 i^2");
		System.out.println("4. Terminar");
	}
}
