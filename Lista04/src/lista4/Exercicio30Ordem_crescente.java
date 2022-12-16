package lista4;

import java.util.Scanner;

public class Exercicio30Ordem_crescente {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int numero1, numero2, numero3, maior, menor, meio;

		System.out.println("Digite o primeiro valor: ");
		numero1 = obj.nextInt();

		System.out.println("Digite o segundo valor: ");
		numero2 = obj.nextInt();

		System.out.println("Digite o terceiro valor: ");
		numero3 = obj.nextInt();

		if (numero1 <= numero2 && numero1 <= numero3) {
			menor = numero1;
			if (numero2 <= numero3) {
				meio = numero2;
				maior = numero3;
			} else {
				meio = numero3;
				maior = numero2;
			}
		}
		if (numero2 <= numero1 && numero2 <= numero3) {
			menor = numero2;
			if (numero1 <= numero3) {
				meio = numero1;
				maior = numero3;
			} else {
				meio = numero3;
				maior = numero1;
			}
			System.out.println(menor + "-" + meio + "-" + maior);
		}
		if (numero3 <= numero1 && numero3 <= numero2) {
			menor = numero3;
			if (numero1 <= numero2) {
				meio = numero1;
				maior = numero2;
			} else {
				meio = numero2;
				maior = numero1;
			}
			System.out.println(menor + "-" + meio + "-" + maior);
		}
		obj.close();
	}

}
