package br.com.larissa;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida. Informe um número positivo. ");
        } else if (idade >= 18) {
            System.out.println("Você é maior de idade. ");
        } else {
            System.out.println("Você não é maior de idade. ");
        }
        scanner.close();
    }
}



