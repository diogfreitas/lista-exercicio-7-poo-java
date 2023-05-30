package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de CPF no formato xxx.xxx.xxx-xx: ");
		String cpf = sc.nextLine();

		if (validarCPF(cpf)) {
			System.out.println("CPF válido.");
		} else {
			System.out.println("CPF inválido.");
			sc.close();
		}
	}

	public static boolean validarCPF(String cpf) {
		// Remove os caracteres 
		cpf = cpf.replaceAll("[^0-9]", "");

		// Verifica se o CPF possui 11 numeros 
		if (cpf.length() != 11) {
			return false;
		}

		// Verifica se todos os numeros sao iguais (caso especial que n é valido)
		if (cpf.matches("(\\d)\\1{10}")) {
			return false;
		}

		// Calcula os numeros verificadores
		int soma = 0;
		int peso = 10;

		for (int i = 0; i < 9; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * peso;
			peso--;
		}

		int digito1 = 11 - (soma % 11);
		if (digito1 > 9) {
			digito1 = 0;
		}

		soma = 0;
		peso = 11;

		for (int i = 0; i < 10; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * peso;
			peso--;
		}

		int digito2 = 11 - (soma % 11);
		if (digito2 > 9) {
			digito2 = 0;
		}

		// Verifica se os numeros verificadores calculados são iguais aos numeros
		return digito1 == Character.getNumericValue(cpf.charAt(9))
				&& digito2 == Character.getNumericValue(cpf.charAt(10));
		
	}
}
