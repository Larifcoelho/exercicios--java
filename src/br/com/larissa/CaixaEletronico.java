package br.com.larissa;

import java.util.Scanner;

class CaixaEletronico {
    public static void main (String[] args ){

        Scanner scanner = new Scanner (System.in);
       double saldo = 1000.00;

        System.out.println("Olá! Gostaria de fazer um depósito ou sacar um valor? ");
        System.out.println("1 - para sacar");
        System.out.println("2 - para depositar");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para saque: R$ ");
                double saque = scanner.nextDouble();

                if (saque > saldo) {
                    System.out.println("Saldo insuficiente. Seu saldo é de R$ " + saldo);
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso.");
                    System.out.println("Saldo atual: R$ " + saldo);
                }
                break;

            case 2:
                System.out.print("Digite o valor para depósito: R$ ");
                double deposito = scanner.nextDouble();

                saldo += deposito;
                System.out.println("Depósito realizado com sucesso.");
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();





    }
}
