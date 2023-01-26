package primera_ev;

public class Prueba_MatricesV2 {

	public static void main(String[] args) {
		final int CARRERAS = 5;
		final int POSICIONES = 6;
		int[][]resultados = new int [CARRERAS][POSICIONES];
		
		// rellenamos las matriz de valores aleatorios
		for (int i= 0; i<resultados.length; i++){
			for (int j=0; j<resultados[i].length; j++) {
			resultados[i][j]= (int)(Math.random()*10+1);
			}//for j
		}//for i
		//recorremos una matirz y la sacamos por pantalla
			for (int i= 0; i<resultados.length; i++){
				for (int j=0; j<resultados[i].length; j++) {
					System.out.print(resultados[i][j]+ " ");
				}//for2
				System.out.println();
			}//for1
	}//main
}//class
