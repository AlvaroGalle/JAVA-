package segunda_EV;
import java.util.Scanner;
public class DavidMain {

	public static void main(String[] args) {
		int arr=3;
		David alum=new David();
		Scanner sc= new Scanner(System.in);
		System.out.println("nombre");
		String nom=sc.nextLine();
		alum.setNom(nom);
		System.out.println(alum.toString());

	}//main

}//class
