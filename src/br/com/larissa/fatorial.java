package br.com.larissa;

import java.util.Scanner;

    public class fatorial {
     public static void main(String [] args){

         //entrada
    Scanner scanner = new Scanner (System.in);
    int numero;
    long fatorial = 1;

        //processamento
    System.out.println("Digite um número para ser calculado o fatorial do mesmo: ");
    numero = scanner.nextInt();

    for (int i = 1; i<=numero; i++){
        fatorial = fatorial * i;
    }

    //saída
         System.out.println("O resultado é fatorial é: " + numero + " = " + fatorial);


        scanner.close();


    }
}
