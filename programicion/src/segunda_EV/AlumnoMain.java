package segunda_EV;
import java.util.Scanner;
//1.5Puntos
public class AlumnoMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantos alumnos tienes");
		int x=sc.nextInt();
		Alumno alumn[]=new Alumno[x];
		sc.nextLine();
		for (int cont=0; cont<x; cont++){
			alumn[cont]=new Alumno();
			System.out.println("Apellido del " +  (cont+1) + " alumno" );
			String apellido= sc.nextLine();
			alumn[cont].setApellido(apellido);
			System.out.println("Nombre del " + (cont+1) + " alumno" );
			String nombre= sc.nextLine();
			alumn[cont].setNombre(nombre);
			cont=comprobar(alumn, cont, x);
			
		}//for
		//System.out.println(alumn[cont].toString());
		//comprobar(alumn); //función
		
		sc.close();
	}//main
	
	
////////////////////////////////////////////////////////////
	public static int comprobar (Alumno alumnos[], int contV2, int max){
		for( int burbuja=0; burbuja<alumnos.length;burbuja++) {
			if ((burbuja+1)<=contV2 && contV2>0 && (burbuja+1)!=max ){
					if (alumnos[contV2].equals(alumnos[(burbuja)])){
						System.out.println("Ese alumno ya existe");
						contV2--;
						break;
					}//if
			}//if
		}//for
		return contV2;
	}//comprobar
	
}//class
