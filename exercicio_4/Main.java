package exercicio_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número até 99: ");
		int numero = sc.nextInt();

		String numeroPorExtenso = obterNumeroPorExtenso(numero);

		if (numeroPorExtenso != null) {
			System.out.println(numeroPorExtenso);
		} else {
			System.out.println("Número inválido.");
			sc.close();
		}
	}

	public static String obterNumeroPorExtenso(int numero) {
		if (numero < 0 || numero > 99) {
			return null;
		}

		String[] unidades = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
				"onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };

		String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
				"noventa" };

		if (numero < 20) {
			return unidades[numero];
		} else {
			int unidade = numero % 10;
			int dezena = numero / 10;
			String extenso = dezenas[dezena];

			if (unidade > 0) {
				extenso += " e " + unidades[unidade];
			}

			return extenso;
		}
	}

}
