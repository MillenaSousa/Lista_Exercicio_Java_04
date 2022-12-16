package lista4;

import java.util.Scanner;

public class Exercicio21Xadrez {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int comeco, fim, duracao;

		System.out.println("Digite o horario em que a partida foi iniciada: ");
		comeco = obj.nextInt();

		System.out.println("Digite o horario em que a partida foi finalizada: ");
		fim = obj.nextInt();

		duracao = fim - comeco;

		if (duracao < 0) {
			duracao = duracao + 24;
			System.out.println("A partida durou: " + duracao + "hrs");
		} else {
			System.out.println("A partida durou: " + duracao + "hrs");
		}
		obj.close();

	}

}
