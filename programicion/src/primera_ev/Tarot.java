package primera_ev;
import java.util.Scanner;

public class Tarot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int D = 0;
		int M = 0;
		int AÑO = 0;
		int Result=0;
	    int X= 0;
	    int Y= 0;
	    int Z= 0;
		System.out.println ("Cual es tu fecha de nacimiento");
		System.out.println ("Dia");
		Scanner sD = new Scanner (System.in);
		D=sD.nextInt();
		sD.close();
		System.out.println ("Mes");
		Scanner sM = new Scanner (System.in);
		M=sM.nextInt();
		sM.close();
		System.out.println ("Año");
		Scanner sA = new Scanner (System.in);
		AÑO=sA.nextInt();
		sA.close();
			Result= D + M + AÑO;
		X= Result/1000;
		Result= Result - (X * 1000);
		Y= Result/100;
		Result= Result - (Y * 100);
		Z= Result/10;
		Result= Result - (Z * 10);
		Result= X + Y +Z + Result;

		if (Result < 10);{
		Y= Result/100;
		Result= Result - (Y * 100);
		Z= Result/10;
		Result= Result - (Z * 10);
		Result= Y +Z + Result;
			if (Result < 10);{
				Z= Result/10;
				Result= Result - (Z * 10);
				Result= Z + Result;
			}//if2

		} //if
	System.out.println ("Tu número de Tarot es el " +Result);
			
				

	}//main

}//class
