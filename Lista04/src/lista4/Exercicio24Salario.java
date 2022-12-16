package lista4;

import java.util.Scanner;

public class Exercicio24Salario {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float salario, vendas, comissao;

		System.out.println("Digite o seu salario fixo: R$ ");
		salario = obj.nextFloat();

		System.out.println("Digite o valor das vendas efetuada: R$");
		vendas = obj.nextFloat();

		if (vendas == 0) {

			System.out.println("Você nao efetuou nenhuma venda seu salario continua: R$ " + salario);
		} else if (vendas >= 1.500) {
			comissao = vendas + (salario + vendas * 5 / 100);
			System.out.println("O seu salario como o acressimo da comissão das vendas é: R$ " + comissao);
		} else {
			comissao = vendas + (salario + vendas * 3 / 100);
			System.out.println("O seu salario mais o acressimo da comissão das vendas é: R$ " + comissao);
		}
		obj.close();
	}

}
