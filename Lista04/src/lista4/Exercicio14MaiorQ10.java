package lista4;

import java.util.Scanner;

public class Exercicio14MaiorQ10 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int valor;

		System.out.println("Digite um valor: ");
		valor = obj.nextInt();

		if (valor > 10) {
			System.out.println("Valor maior que 10.");
		} else {
			System.out.println("Valor menor que 10.");
		}
		obj.close();
	}
}