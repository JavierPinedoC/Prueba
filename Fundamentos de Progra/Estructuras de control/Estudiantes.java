import java.util.Scanner;

public class Estudiantes{

	public static void main(String args[]){

		String nomP, nomM1, nomM2, nomM3, indicadorEs;
		double cM1, cM2, cM3,pro;
		int ap;
		

		nomP = leestring("Nombre del alumno: ");
		nomM1 = leestring("Nombre de la Materia 1: ");
		nomM2 = leestring("Nombre de la Materia 2: ");
		nomM3 = leestring("Nombre de la Materia 3: ");
		cM1 = leedouble("Cual es la calificacion de " + nomM1 + "?: ");
		cM2 = leedouble("Cual es la calificacion de " + nomM2 + "?: ");
		cM3 = leedouble("Cual es la calificacion de " + nomM3 + "?: ");

		pro = prom(cM1,cM2,cM3);
		indicadorEs = indiEstu(pro);
		ap = numApro(cM1,cM2,cM3);

		if(validCal(cM1,cM2,cM3) == true){
			System.out.println("");
			System.out.printf("Tu promedio es: %.2f\n",pro);
			System.out.println("Tu eres un estudiante: " + indicadorEs);
			System.out.println("Tus materias aprobadas son: " + ap);

		}

		else{
			System.out.println("");
			System.out.printf("Error al ingresar los datos, por favor de verificar\n");
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

public static String leestring(String letrero){

	Scanner v;
	String materias;

	v = new Scanner(System.in);
	System.out.print(letrero);
	materias = v.nextLine();

return materias;

}

public static boolean validCal(double cM1, double cM2, double cM3){

	boolean rmat;

	
	if((cM1>=10 && cM1<=100 ) && (cM2 >= 10 && cM2 <= 100) && (cM3 >= 10 && cM3 <= 100))
		rmat = true;
	else
		rmat = false;

return rmat;
}

public static double prom(double cM1, double cM2, double cM3){

	double promedio;

	promedio = ((cM1 + cM2 + cM3) / 3);

	return promedio;
}

public static String indiEstu(double prom){

	String indicador;
	indicador = "";

	if (prom >= 90)
		indicador = "Excelente";
	if(prom >= 80 && prom < 90)
		indicador = "Bueno";
	if(prom >= 70 && prom < 80)
		indicador = "Regular";
	if(prom < 70)
		indicador = "Malito";

return indicador;

}

public static int numApro(double cM1, double cM2, double cM3){

	int matApro;
	matApro = 0;

	if((cM1 >= 70))
		matApro++;
	
	if((cM2 >= 70))
		matApro++;
	
	if((cM3 >= 70))
		matApro++;

return matApro;
}

}