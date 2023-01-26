package segunda_EV;

public class Tablero {
	private char[][] tablero;
	
	public Tablero(int tamano, char dibujo){ //nombre_Constructor == nombre_Class
	this.tablero=new char[tamano][tamano];
	rellena(dibujo);
	}//tablero
	
	@Override
		public String toString() {
		String result="";
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length; j++) {
				result+= tablero[i][j] + " ";
			}//forJ
			result+="\n"; // "\n" es un salto de línea
		}//forI
			return result;
	}//toString
		
		public void rellena(char caracter) {
			for(int i=0; i<tablero.length;i++) {
				for(int j=0; j<tablero[i].length;j++) {
					tablero[i][j]= caracter;
				}//forJ
			}//forI
		}//Char_Rellena
	
		public char getCasilla(int ancho, int alto) {
			return tablero[ancho][alto];
		}//getCasilla
		
		public void setCasilla(int ancho, int alto, char cambio) {
			tablero[ancho][alto]=cambio;
		}//setCasilla
		
}//class
