public class PilaEstatica implements PilaDeObjetos{
	protected static final int TAMAÑO_POR_DEFECTO=10;
	protected Object [] pila;
	protected int numElementos;

	public PilaEstatica(int tamaño) { //constructor con argumento tamaño
		pila= new Object [tamaño];
		numElementos=0;
	}//constructor1
	
	public PilaEstatica() {
		this(TAMAÑO_POR_DEFECTO);//this() llama al constructor que tenga argumentos de tipo int
	}//constructor2
	
	@Override
	public Object pop() { //pop -> sacar
		if(isEmpty()) {
			return null;
		}//if
		numElementos--;
		return pila[numElementos];
	}//pop
	
	@Override
	public boolean push(Object o) { //push -> meter
		if (numElementos== pila.length) {
			return false;
		}//if
		pila[numElementos]=o;
		numElementos++;
		return true;
	}//push
	
	@Override
	public boolean isEmpty() {
		return (numElementos==0);
		
	}//PilaEstatica
}//class
