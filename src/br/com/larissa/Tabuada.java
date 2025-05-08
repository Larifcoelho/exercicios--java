package br.com.larissa;

import java.util.Scanner;

public class Tabuada {
    public static void main (String [] args){

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int i = 0;

        while (i <= 10){
            System.out.println(i + "x" + numero + "=" + i * numero  );
            i++;
        }

    }
}
