package primera_ev;

public class Matriz_Asteriscos {

	public static void main(String[] args) {
		int TAMAÑO=7;
		int Tamaño_1= TAMAÑO;
		char Matriz[][]= new char [TAMAÑO][Tamaño_1];
		for (TAMAÑO=0, Tamaño_1=0; TAMAÑO< Matriz.length && Tamaño_1<Matriz.length; Tamaño_1++) {
			Matriz[TAMAÑO][Tamaño_1]='_';
			if (Tamaño_1== (Matriz.length-1)) {
				Tamaño_1=-1;
				TAMAÑO++;
			}///if
		}//for
		for (TAMAÑO=0, Tamaño_1=0; TAMAÑO< Matriz.length; TAMAÑO++, Tamaño_1++) {
			Matriz[TAMAÑO][Tamaño_1]= 'X'; 	
		}//for
		for (TAMAÑO=0, Tamaño_1=Tamaño_1 -1; TAMAÑO< Matriz.length; TAMAÑO++, Tamaño_1--) {
			Matriz[TAMAÑO][Tamaño_1]= 'X'; 	
		}//for
		for (TAMAÑO=0, Tamaño_1=0; TAMAÑO< Matriz.length && Tamaño_1<Matriz.length; Tamaño_1++) {
			System.out.print(Matriz[TAMAÑO][Tamaño_1]);
			if (Tamaño_1== (Matriz.length-1)) {
				System.out.println();
				Tamaño_1=-1;
				TAMAÑO++;
			}//if
		}//for
	}//main
}//class
