package primera_ev;
import java.util.Scanner;
public class esEnteros {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Dame un número");
	int num=sc.nextInt();
	sc.close();

	esEntero(num);
	System.out.println(esEntero(num));
	}//main
	
	public static boolean esEntero(int num) {
		if (num%1>0) {
				
			return true;
		}//if
		else {				
			return false;
		}//else
	}//main esEntero
		
}//class
