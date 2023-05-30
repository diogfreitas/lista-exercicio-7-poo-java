package Exercicio_V;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de telefone celular: ");
		String telefone = sc.nextLine();

		String telefoneCorrigido = corrigirNumeroTelefone(telefone);

		if (telefoneCorrigido != null) {
			System.out.println("Telefone possui " + telefoneCorrigido.length() + " dígitos.");
			System.out.println("Vou acrescentar o dígito nove na frente.");
			System.out.println("Telefone corrigido sem formatação: " + telefoneCorrigido);
			System.out.println("Telefone corrigido com formatação: " + formatarNumeroTelefone(telefoneCorrigido));
		} else {
			System.out.println("Número de telefone inválido.");
			sc.close();
		}
	}

	public static String corrigirNumeroTelefone(String telefone) {
		// Remove caracteres não numricos
		telefone = telefone.replaceAll("[^0-9]", "");

		if (telefone.length() == 8) { // Verifica se  possui 8 dígitos
			return "9" + telefone; // Adiciona o dígito 9 na frente 
		} else if (telefone.length() == 9) { // Verifica se 9 dígitos
			return telefone; // Retorna sem alterações
		} else {
			return null; // Retorna null se for invalido
		}
	}

	public static String formatarNumeroTelefone(String telefone) {
		// Utiliza uma expressão regular para adicionar o traço separador no formato
		// "xxxxx-xxxx"
		return telefone.replaceFirst("(\\d{5})(\\d{4})", "$1-$2");
	}
}