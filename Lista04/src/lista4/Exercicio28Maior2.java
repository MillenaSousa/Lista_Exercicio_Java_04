package lista4;

import java.util.Scanner;

public class Exercicio28Maior2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro valor: ");
		numero1 = obj.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		numero2 = obj.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		numero3 = obj.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O numero " + numero1 + " é maior.");
		}
		else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O numero " + numero2 + " é maior.");
		}
		else {
			System.out.println("O numero " + numero3 + " é maior.");
		}
		obj.close();


	}

	
}
