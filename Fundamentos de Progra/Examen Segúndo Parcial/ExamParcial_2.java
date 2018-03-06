import java.util.Scanner;

public class ExamParcial_2{
	
	public static void main(String args[]) {

		int nFotos, nCapitulos, opcion, n, a, tFotos, sumaFotos;
		String nomLi;
		boolean seguir;
		seguir = true;
		sumaFotos = 0;
		n = 0;
		a = 1;

		do{
			menu();
			System.out.println();
			opcion = leeOpcion("Cual opcion: ", 2);
			sumaFotos = 0;
			n = 0;
			a = 1;
			switch(opcion){

				case (1): {
					
					System.out.println();
					nomLi = leeString("Nombre del libro: ");
					nFotos = leeEntero("Numero de fotos en el libro " + nomLi + ": ");
					nCapitulos = leeEntero("Numero de capitulos en el libro " + nomLi + ": ");

					while(nCapitulos > n){	
						tFotos = leeEntero("Numero de fotos en el capitulo " + a + ": ");
						sumaFotos = sumaFotos + tFotos;
						a = a + 1;
						n = n+1;
					}
					
					System.out.println();
					System.out.println("Evaluacion del libro "+ nomLi);
					System.out.println();

					if(sumaFotos > nFotos){
						System.out.println("El total de fotos por capitulo es mayor que el total de fotos");
						System.out.println("En el total de fotos son "+ nFotos + " Fotos");
						System.out.println("y en la evaluacion por capitulo son " + sumaFotos + " Fotos");
					}

					else if (sumaFotos==nFotos){
						System.out.println("El total de fotos por capitulo es igual que el total de fotos");
						System.out.println("En el total de fotos son: "+ nFotos + " Fotos");
						System.out.println("y en la evaluacion por capitulo son " + sumaFotos + " Fotos");
					}

					else{
						System.out.println("El total de fotos por capitulo es menor que el total de fotos");
						System.out.println("En el total de fotos son: "+ nFotos + " Fotos");
						System.out.println("y en la evaluacion por capitulo son " + sumaFotos + " Fotos");
					}

					break;
				}

				case(2): {

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

	public static String leeString(String letrero){

		String variable;
		Scanner s;

		System.out.print(letrero);
		s = new Scanner(System.in);
		variable = s.nextLine();

		return variable;
	}

	public static void menu(){
		System.out.println();
		System.out.println("1. Evaluar libro");
		System.out.println("2. Terminar");
	}
}