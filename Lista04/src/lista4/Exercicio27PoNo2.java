package lista4;

import java.util.Scanner;

public class Exercicio27PoNo2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = obj.nextInt();

		if (numero <0){
			System.out.println("Número negativo");
		}
		else if( numero == 0){
			System.out.println("Número zero");
		}
		else{
			System.out.println("Número positivo");
		}
		obj.close();

	}

}
