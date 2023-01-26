package segunda_EV;

public class Juego {

	public static void main(String[] args) {
		Tablero t1 = new Tablero(5, '*');
		// t1.rellena('#');
		t1.setCasilla(3, 3, ' ');
		System.out.println(t1);
	}// main

}// class
