package primera_ev;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		int result;
		int contador= 1;
		System.out.println("Vamos a multiplicar");
		System.out.println("Dame el primer número");
			a = sc.nextInt();
			sc.close();
		System.out.println("Dame el segundo número");
			b= sc.nextInt();
			sc.close();
		result = a;
		while (contador <= b);{
				result= result + a;
				contador= contador + 1;
		}
	System.out.println(result);
	}
		
}