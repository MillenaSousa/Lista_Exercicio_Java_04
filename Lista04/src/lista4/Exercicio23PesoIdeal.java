package lista4;

import java.util.Scanner;

public class Exercicio23PesoIdeal {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float altura, peso;
		String name, sexo;

		System.out.println("Digite seu nome: ");
		name = obj.nextLine();

		System.out.println("Digite seu sexo [f/m]: ");
		sexo = obj.nextLine();

		System.out.println("Digite sua altura: ");
		altura = obj.nextFloat();

		if (sexo == "m" || sexo == "M") {
			peso = (float) ((72.7 * altura) - 58);

		} else {
			peso = (float) ((62.1 * altura) - 44.7);
		}
		System.out.println("Nome: " + name);
		System.out.printf("Peso ideal: %.2f " , peso);

		obj.close();
	}

}
