package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        String nomeMaiusculo = nome.toUpperCase();// metodo de classe "String" converte caracteres de uma string para letras maiusculas.
        StringBuilder nomeInvertido = new StringBuilder(nomeMaiusculo).reverse();// Classe StringBuilder em Java pode criar String modificaveis.

        System.out.println("Seu nome de tras para frente em letras maiusculas: " + nomeInvertido);
        
        sc.close();
    }
}


