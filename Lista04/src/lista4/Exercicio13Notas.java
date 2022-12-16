package lista4;

import java.util.Scanner;

public class Exercicio13Notas {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = obj.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = obj.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = obj.nextFloat();
		
		media = (nota1 *2 + nota2 *3 + nota3 *5) / 10;
		
		System.out.println("A media final do aluno foi: " + media);
		
		obj.close();
	}

}
