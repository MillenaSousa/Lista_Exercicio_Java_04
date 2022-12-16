package lista4;

import java.util.Scanner;

public class Exercicio19Maior {

	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = obj.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O valor maior é: " + valor1);
		}else {
			System.out.println("O valor maior é: " + valor2);
		}
		obj.close();
	}
}
