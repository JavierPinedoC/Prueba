import java.util.Scanner;

public class Triangulos{

	public static void main(String args[]){

		double a1,a2,a3;
		String triangulo;


		a1 = leedouble("Dame el valor del angulo a1: ");
		a2 = leedouble("Dame el valor del angulo a2: ");
		a3 = leedouble("Dame el valor del angulo a3: ");

		

		if (estriangulo(a1,a2,a3)){
			triangulo = evaluaTriangulo(a1,a2,a3);
		

		System.out.println();
		System.out.println("El triangulo es: " + triangulo);
		}

		else{
			System.out.println();
			System.out.println("Error en los datos que ingreaste");
		}
	}

public static boolean estriangulo(double a1, double a2, double a3){

	boolean tr;

	tr = false;

	if((a1>0 && a1<180) && (a2>0 && a2<180) && (a3>0 && a3<180))

		if (a1 + a2 + a3 == 180)
			tr = true;
	
		return tr;

}// fin es triangulo

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
}

public static String evaluaTriangulo(double a1, double a2, double a3){

	String triangulo;

	if (equilatero(a1,a2,a3))
		triangulo = "Equilatero";
	
	else if (isoseles(a1,a2,a3))
		triangulo = "Isoseles";
	
	else
		triangulo = "Escaleno";

	return triangulo;


}

public static boolean equilatero(double a1, double a2, double a3){

	boolean eval;

	if (a1 == a2 && a2 == a3)
		eval= true;
	
	else 
		eval = false;

	return eval;
}

public static boolean isoseles(double a1, double a2, double a3){

	boolean eval;

	if (a1 == a2 || a2 == a3 || a1 == a3)
		eval = true;
	else
		eval = true;
return eval;
}

}