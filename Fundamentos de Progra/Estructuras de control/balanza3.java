import java.util.Scanner;

public class balanza3{

	public static void main(String args[]){

		double m1,m2,m3,m4,m5,m6,m7,m8;
		String pesTo;

		m1 = leedouble("Dame el peso de la moneda 1: ");
		m2 = leedouble("Dame el peso de la moneda 2: ");
		m3 = leedouble("Dame el peso de la moneda 3: ");
		m4 = leedouble("Dame el peso de la moneda 4: ");
		m5 = leedouble("Dame el peso de la moneda 5: ");
		m6 = leedouble("Dame el peso de la moneda 6: ");
		m7 = leedouble("Dame el peso de la moneda 7: ");
		m8 = leedouble("Dame el peso de la moneda 8: ");

	pesTo = pesoMoneda(m1,m2,m3,m4,m5,m6,m7,m8);

	System.out.println(pesTo);	
}

public static double leedouble(String letrero){
	double valor;
	Scanner s;
	
	s = new Scanner(System.in);
	System.out.print(letrero);
	valor = s.nextDouble();
	
	return valor;
}

public static String pesoMoneda(double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8){

	double g1, g2;
	String pemas;
	pemas = "";
	g1 = m1 + m2 + m3;
	g2 = m4 + m5 + m6;

	if (g1 == g2)
			if(m7 > m8)
			pemas = "Moneda 7 pesa mas";
			else
			pemas = "Moneda 8 pesa mas";
	else if (g1>g2)
			if(m1>m2)
			pemas = "Moneda 1 pesa mas";
			else if (m1<m2)
			pemas = "Moneda 2 pesa mas";
			else
			pemas = "Moneda 3 pesa mas";
	else if (g1<g2)
			if(m4>m5)
			pemas = "Moneda 4 pesa mas";
			else if (m4<m5)
			pemas = "Moneda 5 pesa mas";
			else
			pemas = "Moneda 6 pesa mas";	
return pemas;
}
}