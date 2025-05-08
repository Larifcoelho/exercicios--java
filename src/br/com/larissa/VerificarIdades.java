package br.com.larissa;
import java.util.Scanner;
public class VerificarIdades {
    public static void main (String [] args) {

        int maiorDeIdade = 0;

        Scanner scanner = new Scanner (System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");


            int idade = scanner.nextInt();

            if (idade >= 18) {
                maiorDeIdade++;

            }
        }
        System.out.println("Quantidade de pessoas com 18 anos ou mais: " + maiorDeIdade);


        scanner.close();

    }
}
