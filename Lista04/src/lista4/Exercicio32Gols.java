package lista4;

import java.util.Scanner;

public class Exercicio32Gols {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int golA, golB;
		String timeA, timeB;
		
		
		System.out.println("time A: ");
		timeA = obj.next();
		
		System.out.println("Time B: ");
		timeB = obj.next();
		
		System.out.println("Quantos gols fez o time A: ");
		golA = obj.nextInt();
		
		System.out.println("Quantos gols fez o time B: ");
		golB = obj.nextInt();
		

		if (golA >= golB) {
			System.out.println("O " + timeA + " ganhou do" +  timeB + " de : " + golA + " a " + golB);
		} else if (golB >= golA) {
			System.out.println("O " + timeB + " ganhou do" +  timeA + " de : " + golB + " a " + golA);
		} else {
			System.out.println("Houve um empate de  : " + golB + " a" + golA);
		}
		obj.close();
	}

}
