 package primera_ev;

public class MatricesAsteriscos {

	public static void main(String[] args) {
		final int FILAS=5;
		final int COLUMNAS = 4;
		char [][]tablero = new char [FILAS][COLUMNAS];
		for (int i = 0; i<tablero.length; i++) {
			for(int j=0; j<tablero.length; j++) {
				if ((i+j)%2==0) {
					System.out.print("* ");
				}//if
				else {
					System.out.print("- ");
				}//else                  
			}//for J
			System.out.println();
		}//for i

	}//main

}//class
