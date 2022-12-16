package lista4;

import java.util.Scanner;

public class Exercicio15PoNe {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int valor;

		System.out.println("Digite um valor: ");
		valor = obj.nextInt();

		if (valor >= 0) {
			System.out.println("O valor: " + valor + " é positivo.");
		} else {
			System.out.println("O valor: " + valor + " é negativo.");
		}
		obj.close();
	}
}
