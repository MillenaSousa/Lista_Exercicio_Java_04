package lista4;

import java.util.Scanner;

public class Exercicio25Conta {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int conta;
		float saldo, debito, credito, atual;

		System.out.println("Digite o numero da sua conta: ");
		conta = obj.nextInt();

		System.out.println("Digte o valor do saldo: ");
		saldo = obj.nextFloat();

		System.out.println("Digite o valor do debito: ");
		debito = obj.nextFloat();

		System.out.println("Digite o valor do credito: ");
		credito = obj.nextFloat();

		atual = saldo - debito + credito;

		System.out.println("Conta: " + conta);
		if (atual > 0) {
			System.out.println("Saldo Positivo!");
		} else {
			System.out.println("Saldo Invalido!");
		}
		obj.close();

	}

}
