package primera_ev;

public class James {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int result=0;
		result=operacion(num1, num2, result);
		System.out.println(result);

	}//main
	/////////////////////////////////////////////////////////////////
	
public static int operacion (int uno, int dos, int solucion) {
	solucion= uno + dos;
	return solucion;
}//operacion

}//class
