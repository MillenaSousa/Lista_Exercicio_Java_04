package lista4;

import java.util.Scanner;

public class Exercicio18Voto {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int ano, idade, nasc;
		
		System.out.println("Digite o ano em que estamos: ");
		ano = obj.nextInt();
		
		System.out.println("Digite o ano de seu nascimento: ");
		nasc = obj.nextInt();
		
		idade = ano - nasc;
		
		if (idade >= 16) {
			System.out.println("Você tem "+ idade + " anos " + "você podera votar esse ano!");
		}else {
			System.out.println("Você tem "+ idade + " anos " + "você não podera votar esse ano!");
		}
		obj.close();
	}
}
