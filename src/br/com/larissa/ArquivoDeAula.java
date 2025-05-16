package br.com.larissa;

import java.util.Scanner;

public class ArquivoDeAula {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        char letra1 = nome.charAt(0);
        char letra3 = nome.charAt(2);

        System.out.print("Digite o cpf: ");
        String cpf = scanner.nextLine();

        int soma = 0;
        for (int i = 0; i < cpf.length(); i++) {
            soma += cpf.charAt(i) - '0';
        }

        int TerceiroDigito = cpf.charAt(2) - '0';
        int QuintoDigito = cpf.charAt(4) - '0';
        int SetimoDigito = cpf.charAt(6) - '0';

        int DivisaodosDigitos = (QuintoDigito != 0) ? TerceiroDigito % QuintoDigito : 1;
        int UltimoDigito = DivisaodosDigitos + SetimoDigito;

        System.out.println("Bem vindo " + nome + ", seu codigo é: " + letra1 + letra3 + soma + " - " + UltimoDigito);
    }
}