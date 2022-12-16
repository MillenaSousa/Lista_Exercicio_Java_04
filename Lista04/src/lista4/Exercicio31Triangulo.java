package lista4;

import java.util.Scanner;

public class Exercicio31Triangulo {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int ladoA, ladoB, ladoC;

		System.out.println("Digite o valor do lado A: ");
		ladoA = obj.nextInt();

		System.out.println("Digite o valor do lado B: ");
		ladoB = obj.nextInt();

		System.out.println("Digite o valor do lado C: ");
		ladoC = obj.nextInt();

		if (ladoA + ladoB > ladoC & ladoB + ladoC > ladoA & ladoA + ladoC > ladoB) {
			System.out.println("Pode se criar um triangulo");
		} else {
			System.out.println("Não pode se formar um triangulo");
		}
		

		obj.close();
	}

}
