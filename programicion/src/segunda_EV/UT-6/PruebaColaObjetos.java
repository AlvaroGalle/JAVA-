import ColaObjetos;
import ColaObjetosE;

public class PruebaColaObjetos {

	public static void main (String[] args) {
		ColaObjetos cola = new ColaObjetos;
		
		for (int i=1; i<=10; i++) {
		cola.add("Elemento nº " + i);
		}//for
		
		while (!cola.isEmpty()) {
			System.out.println(cola.remove());
		}//while
	}//main
}//class
