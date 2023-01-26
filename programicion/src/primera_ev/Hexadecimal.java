package primera_ev;
	import java.util.Scanner;

public class Hexadecimal {
public static void main(String[] args) {
	int decimal;
	String binario= "";
	int elevado2=1024;
	System.out.println("Dame el número decimal");
	Scanner sD=new Scanner(System.in);
	decimal=sD.nextInt();
	sD.close();
	while (elevado2 > decimal) {
		elevado2= elevado2/2;
	}//while
	while (elevado2 > 0) {
		if (decimal >= elevado2){
			binario= binario + "1";
			decimal= decimal-elevado2;
			elevado2= elevado2/2;
		}//if
		else {
			binario = binario + "O";
			elevado2= elevado2/2;
		}//else

	}//while
	System.out.println("El número en Binario es " + binario);
	}//main

}//class
