public class PruebaPila {

	public static void main(String[] args) {
		PilaDeObjetos pila = new PilaEstatica();
		
		for(int i=1; i<=10; i++) {
			pila.push((char)('A' +i));
		}//for
		
		while (!pila.isEmpty()) {
			Object o= pila.pop();
			System.out.println(o);
		}
	}//main

}//class
