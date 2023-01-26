package primera_ev;

public class DecAHex {

	public static void main(String[] args) {
	String cifras="0123456789ABCDEF";
	int num= 3542;
	int resto= 0;
	
	while(num>0) {
	resto= num%16;
	num=num/16;
	System.out.println(cifras.charAt(resto));
	}//while

	}//main
}//class
