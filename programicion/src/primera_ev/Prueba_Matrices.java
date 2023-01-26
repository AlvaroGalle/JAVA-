package primera_ev;

public class Prueba_Matrices {

	public static void main(String[] args) {
		int [][] notas1 = new int [30][6];
		int notas2[][]= {
				{5,6,7},
				{7,6,5},
				{1,2,3},
				{10,10,9}
		};//notas2
		//recorremos una matirz y la sacamos por pantalla
		for (int i= 0; i<notas1.length; i++){
			for (int j=0; j<notas2[i].length; j++) {
				System.out.print(notas2[i][j]+ " ");
			}//for2
			System.out.println();
		}//for1
	}//main

}//class
