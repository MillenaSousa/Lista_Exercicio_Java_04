package lista4;

import java.util.Scanner;

public class Exercicio17Media {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float nota1, nota2, media;

		System.out.println("Digite a nota da primeira avaliação: ");
		nota1 = obj.nextFloat();

		System.out.println("Digite a nota da segunda avaliação: ");
		nota2 = obj.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Media: " + media);
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Media: " + media);
			System.out.println("Aluno reprovado!");
		}
		obj.close();
	}

}
