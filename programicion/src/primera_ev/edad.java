package primera_ev;

import java.util.Scanner;

public class edad {

	public static void main(String[] args){
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int actual;
				int lvl;
				int nacimiento;
				System.out.println("¿En qué año estamos?");
				actual = sc.nextInt();
				sc.close();
				System.out.println("¿En qué año naciste?");
				nacimiento = sc.nextInt();
				sc.close();
				lvl = actual-nacimiento;
				System.out.println("Este año cumples "+lvl+" años");
///hahahaa
	}

}
