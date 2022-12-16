package lista4;

import java.util.Scanner;

public class Exercicio26Estoque {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int qtd_atual, qtd_maxima, qtd_minima, media;

		System.out.println("Digite a quantidade atual de produtos em estoque: ");
		qtd_atual = obj.nextInt();

		System.out.println("Digite a quantidade maxima de produtos que cabem no estoque: ");
		qtd_maxima = obj.nextInt();

		System.out.println("Digite a quantidade minima de preodutos que cabem no estoque");
		qtd_minima = obj.nextInt();

		media = (qtd_maxima + qtd_minima) / 2;

		if (media >= qtd_atual) {
			System.out.println("Nao efetuar compra!");
		} else {
			System.out.println("Efetuar compra!");
		}

		obj.close();

	}

}
