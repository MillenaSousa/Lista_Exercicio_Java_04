package lista4;

import java.util.Scanner;

public class Exercicio29SomaMaior {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int numero1, numero2, numero3, maior, maior2, soma;

		System.out.println("Digite o primeiro valor: ");
		numero1 = obj.nextInt();

		System.out.println("Digite o segundo valor: ");
		numero2 = obj.nextInt();

		System.out.println("Digite o terceiro valor: ");
		numero3 = obj.nextInt();

		if (numero1 >= numero2 && numero1 >= numero3) {
			maior = numero1;
			if (numero2 >= numero3) {
				maior2 = numero2;
			} else {
				maior2 = numero3;
			}
			soma = maior + maior2;
			System.out.println("A soma dos dois maiores numero digitados é: " + soma);
		}
		if (numero2 >= numero1 && numero2 >= numero3) {
			maior = numero2;
			if (numero1 >= numero3) {
				maior2 = numero1;
			} else {
				maior2 = numero3;
			}
			soma = maior + maior2;
			System.out.println("A soma dos dois maiores numero digitados é: " + soma);
		}
		if (numero3 >= numero2 && numero3 >= numero1) {
			maior = numero3;
			if (numero2 >= numero1) {
				maior2 = numero2;
			} else {
				maior2 = numero1;
			}
			soma = maior + maior2;
			System.out.println("A soma dos dois maiores numero digitados é: " + soma);
		}
		obj.close();
	}

}
