package br.com.larissa;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        int idades;
        int soma = 0;
         int media=0 ;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            soma = soma + idade;

        }
        media = soma / 10;

        System.out.println("A média das idades é:" + media);


        scanner.close();



    }
}
