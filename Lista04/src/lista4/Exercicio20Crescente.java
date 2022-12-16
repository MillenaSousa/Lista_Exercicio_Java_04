package lista4;

import java.util.Scanner;

public class Exercicio20Crescente {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		valor2 = obj.nextInt();
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " - " + valor2);

		}else {
			System.out.println(valor2 + " - " + valor1);
		}
		obj.close();
	}

}
