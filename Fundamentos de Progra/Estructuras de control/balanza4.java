import java.util.Scanner;

public class balanza4{

	public static void main(String args[]){
	double m1,m2,m3,m4,m5,m6,m7,m8;
	double pesTo;

		m1 = leedouble("Dame el peso de la moneda 1: ");
		m2 = leedouble("Dame el peso de la moneda 2: ");
		m3 = leedouble("Dame el peso de la moneda 3: ");
		m4 = leedouble("Dame el peso de la moneda 4: ");
		m5 = leedouble("Dame el peso de la moneda 5: ");
		m6 = leedouble("Dame el peso de la moneda 6: ");
		m7 = leedouble("Dame el peso de la moneda 7: ");
		m8 = leedouble("Dame el peso de la moneda 8: ");
	
	pesTo = encuentraMayor(m1,m2,m3,m4,m5,m6,m7,m8);

	System.out.println();
	System.out.println("La moneda mayor es la que tenga el peso de: " + pesTo);
		
}

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
}

public static double encuentraMayor(double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8){

	double g1, g2, mayor;
	
	g1 = m1 + m2 + m3;
	g2 = m4 + m5 + m6;

	if (g1 == g2)
		if(m7 > m8)
			mayor = m7;
		else
			mayor = m8;
	else if (g1>g2)
		mayor = mayor3(m1,m2,m3);
	else 
		mayor = mayor3(m4,m5,m6);	

return mayor;
}

public static double mayor3(double ma, double mb, double mc){

	double mayor;

	if (ma == mb)
		mayor = mc;
	else if (ma>mb)
		mayor = ma;
	else
		mayor = mb;

return mayor;
}
}