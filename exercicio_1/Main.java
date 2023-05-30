package exercicio_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite duas frases.");
		System.out.print("Frase 1 : ");
		String string1 = sc.nextLine();
		System.out.print("Frase 2 : ");
		String string2 = sc.nextLine();

		System.out.println("Tamanho de \"" + string1 + "\": " + string1.length() + " caracteres");
		System.out.println("Tamanho de \"" + string2 + "\": " + string2.length() + " caracteres");

		if (string1.length() == string2.length()) {
			System.out.println("As duas strings são de tamanhos iguais.");
		} else {
			System.out.println("As duas strings são de tamanhos diferentes.");
		}

		if (string1.equals(string2)) {
			System.out.println("As duas strings possuem conteúdo igual.");
		} else {
			System.out.println("As duas strings possuem conteúdo diferente.");
			
			
			sc.close();
			
		}
	}
}
