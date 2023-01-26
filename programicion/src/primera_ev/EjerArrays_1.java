package primera_ev;
public class EjerArrays_1 {

	public static void main(String[] args) {
		int n= (int) (Math.random()*9+1);
		int ARRAY1[]= new int [n];
		int almacenN;
		almacenN=n;
		n=0;
		int ULTIMO_RECURSO=0;
		while (n<almacenN || almacenN==0){
		ARRAY1[n]= (int)(Math.random()*10);
		n=n+1;
		}//while
		n=0;
		System.out.print("Vector sin invertir ");
		while (n<almacenN) {
			System.out.print(ARRAY1[n]+ " ");
			if (n!=almacenN) {
			n=n+1;
			}
		}
		if (n%2==0) {
			int mitad;
			mitad=n/2;
			int ARRAY2[]= new int [mitad];
		int almacenM= mitad;
		mitad=0;
			while (n!=almacenM){
				if (n>mitad) {
					n=0;	
				}//if
			ARRAY2[mitad]= ARRAY1[n];
			mitad= mitad+1;
			n= n +1;
			}//while
		n=0;
		mitad = mitad-1;
		while(ULTIMO_RECURSO==0){
			ARRAY1[n]= ARRAY2[mitad];
			n=n+1;
			mitad= mitad-1;
			if (mitad < 0) {
				ULTIMO_RECURSO=1;
			}//if
		}//while
		n=0;
		System.out.println();
		System.out.print("Vector con la mitad invertida ");
		while (n<almacenN) {
			System.out.print(ARRAY1[n]+ " ");
			if (n!=almacenN) {
			n=n+1;
			}//if
		}//while
		
		}//if
		else {
			System.out.println();
			System.out.println("Tu vector en impar");
		}//else
	}//main
	
}//class