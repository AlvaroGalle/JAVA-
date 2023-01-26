package primera_ev;
import java.util.Scanner;
public class CadenaTexto_Nombre {
	public static void main(java.lang.String[] args) {
		System.out.println("Dime tu nombre ");
		Scanner sc= new Scanner(System.in);
		String Nombre=sc.nextLine();
		System.out.println("Dime tu primer apellido ");
		String Apellido1=sc.nextLine();
		System.out.println("Dime tu segundo apellido ");
		String Apellido2=sc.nextLine();
		Cadena(Nombre,Apellido1,Apellido2);
		System.out.println(Cadena(Nombre,Apellido1,Apellido2).toUpperCase());

	}//main
	public static String Cadena(String nombre, String apellido1, String apellido2){
		String siglas;
		siglas=nombre.substring(0,3)+ apellido1.substring(0,3)+ apellido2.substring(0,3);
		return siglas;
	}//cadena

}//class
