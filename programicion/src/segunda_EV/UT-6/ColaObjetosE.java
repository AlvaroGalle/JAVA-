public class ColaObjetosE implements ColaObjetos {
	
	protected Object cola[];
	protected int numElementos;
	
	public ColaObjetosE(int tamaño) {
		cola=new Object[tamaño];
		numElementos=0;
	}//Constructor
	
	@Override
	public boolean add(Object obj){
		if (numElementos ==cola.length) {
			return false;
		}//if
		cola[numElementos]=obj;
		numElementos++;
		return true;
	}//add
	
	@Override
	public Object remove() {
		if (isEmpty()) {
			return null;
		}//if 
		Object res = cola[0];
		for(int i=1; i<numElementos; i++ ) {
			cola[i-1]=cola[i];
		}//for
		cola[numElementos-1]= null;
		numElementos--;
		return res;
	}//remove
	
	@Override
	public boolean isEmpty() {
		return (numElementos==0);
	}//isEmpty
	
}//class
