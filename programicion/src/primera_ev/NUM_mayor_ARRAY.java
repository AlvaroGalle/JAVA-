package primera_ev;
import java.util.Scanner;
public class NUM_mayor_ARRAY {
	
	public static void main(String[] args) {
	int c=0;
	int dimension;
	int mayor=0;
	int posMAYOR=0;
	Scanner sc= new Scanner (System.in);
	System.out.println("Dame la dimensión de tu vector ");
	c=sc.nextInt();
	dimension=c;
	int ARRAY[]= new int [c];
	System.out.print("Tu vector es ");
	for (c=0;c<dimension; c++){
		ARRAY[c]=(int)(Math.random()*99+1);
//		ARRAY1[n]= (int)(Math.random()*10);
		System.out.print(ARRAY[c]+ " ");
	}//for
	c=0;
	for (c=0; c<dimension; c++) {
		if (c==0) {
			mayor=ARRAY[c];
			posMAYOR= c;
		}//if
		else {
			if (ARRAY[c]>mayor) {
				mayor=ARRAY[c];
				posMAYOR= c;
			}//if
		}//else
	}//for
	System.out.println();
	System.out.println("El número más grande de tu vector es "+ mayor + " y está en la posición "+ posMAYOR);	
	}//main

}//class