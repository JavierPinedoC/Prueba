import java.util.Scanner;

public class balanza{

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

	pesTo = pesoMoneda(m1,m2,m3);

	if((m1 != m4)||(m2!=m4)||(m3!=m4)){
	System.out.println(pesTo);
	}		
	
	else{
		String pemas;
		pemas = "";

		if (m5>m6)
			if(m5 > m7)
			pemas = "Moneda 5 pesa mas";
			else
			pemas = "Moneda 7 pesa mas";
		else
			if(m6>m7)
			pemas = "Moneda 6 pesa mas";
			else
			pemas = "Moneda 7 pesa mas";
	
	if(m8>m7) {
		pemas = "Moneda 8 pesa mas";	
	}	
	System.out.println(pemas);	
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

public static String pesoMoneda(double m1, double m2, double m3){

	String pemas;
	pemas = "";

	if (m1>m2)
			if(m1 > m3)
			pemas = "Moneda 1 pesa mas";
			else
			pemas = "Moneda 3 pesa mas";
	else
			if(m2>m3)
			pemas = "Moneda 2 pesa mas";
			else
			pemas = "Moneda 3 pesa mas";
			
return pemas;
}
}