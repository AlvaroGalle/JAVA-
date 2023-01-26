package primera_ev;

public class PruebaReves {

	public static void main(String[] args) {
		String texto= "palabra mágica";
		String revés= delRevés(texto);
		revés= delRevésV2(texto);
	}//main
	public static String delRevés(String txt) {
		String res="";
		for(int pos=txt.length()-1 ;pos>= 0;pos--) {
			//res= res+ txt.charAt(pos);
			res= res +txt.charAt(pos);
			System.out.println(res);
		}//for
	return res;
	}//delRevés
	public static String delRevésV2(String txt) {
		String res="";
		for(int pos=txt.length();pos<= 0;pos++) {
			res= txt.charAt(pos) +res;
			System.out.println(res);
		}//for
	return res;
				
	}//delRevésV2
}//class
