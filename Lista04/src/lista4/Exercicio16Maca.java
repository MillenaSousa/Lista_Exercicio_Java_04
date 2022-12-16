package lista4;

import java.util.Scanner;

public class Exercicio16Maca {

	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int maca;
		
		
		
		System.out.println("Digite a quantidade de maçãs compradas: ");
		maca = obj.nextInt();
		
		
		if (maca < 12) {
			
			System.out.println("O valor total é: R$ " + maca * 1.30);
		}else {
			System.out.println("O valor total é: R$ " + maca);
		}
		obj.close();
	}
}
