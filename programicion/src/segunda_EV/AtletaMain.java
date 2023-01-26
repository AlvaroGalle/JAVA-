package segunda_EV;
import java.util.Scanner;
public class AtletaMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantos atletas quieres inscribir");
		int num_atl=sc.nextInt();
		Atleta atl[]=new Atleta[num_atl];
		sc.nextLine();
		for(int x=0; x<num_atl; x++) {
			System.out.println("Nombre del atlela");
			String nom=sc.nextLine();
			//atl[x].setNombre(nom);
			System.out.println("DNI del atlela");
			String dni=sc.nextLine();
			//atl[x].setDNI(dni);
			/*sc.nextInt();*/
			System.out.println("Año de nacimiento");
			int year=sc.nextInt();
			//atl[x].setYear(year);
			//sc.nextFloat();
			System.out.println("Altura (en metros)");
			float altura=sc.nextFloat();
			//atl[x].setAltura(altura);
			//sc.nextInt();
			System.out.println("Peso (en Kg)");
			float peso=sc.nextFloat();
			//atl[x].setPeso(peso);
			int exit=0;
			boolean est=false;
			char scChar=' ';
			while (exit==0) {
				System.out.println("¿Estudia? (s/n)");
				scChar= sc.next().charAt(0);
				if (scChar=='s') {
					exit=1;
					est= true;
					//atl[x].setEstudios(est);
				}//if
				else if(scChar=='n'){
					exit=1;
					est= false;
					//atl[x].setEstudios(est);
				}//else
			}//while
			enum sexo{M, F, X}
			sexo genero=sexo.X;
			while (exit==0) {
				System.out.println("Sexo del atleta (M/F/X)");
				scChar=sc.next().charAt(0);
				if (scChar=='M') {
					genero=sexo.M;
				}//if_M
				if (scChar=='F') {
					genero=sexo.F;
				}//if_F
				if (scChar=='X') {
					genero=sexo.X;
				}//if_X
			}//while
			atl[x]=new Atleta(dni,nom,year,altura,peso,est,genero);
		}//for
		System.out.println(atl[0].toString());
		sc.close();
	}//main

}//class
