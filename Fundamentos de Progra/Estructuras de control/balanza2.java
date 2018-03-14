import java.util.Scanner;

public class balanza2{

	public static void main(String args[]){

		double[] m = new double[8];

		m[0] = leedouble("Dame el peso de la moneda 1: ");
		m[1] = leedouble("Dame el peso de la moneda 2: ");
		m[2] = leedouble("Dame el peso de la moneda 3: ");
		m[3] = leedouble("Dame el peso de la moneda 4: ");
		m[4] = leedouble("Dame el peso de la moneda 5: ");
		m[5] = leedouble("Dame el peso de la moneda 6: ");
		m[6] = leedouble("Dame el peso de la moneda 7: ");
		m[7] = leedouble("Dame el peso de la moneda 8: ");

		for(int i = 0; i < 6; i++){
			if(m[i] != m[i+1] && m[i+1] != m[i+2]){
				System.out.println("La moneda "+(i+2)+" es diferente");
				break;
			}
			else if(m[i] != m[i+1] && m[i] != m[i+2]){
				System.out.println("La moneda "+(i+1)+" es diferente");
				break;
			}
			else if(m[i] != m[i+2] && m[i+1] != m[i+2]){
				System.out.println("La moneda "+(i+3)+" es diferente");
				break;
			}
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
}