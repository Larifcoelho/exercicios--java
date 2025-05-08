package br.com.larissa;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  System.out.println("Digite a sua primeira nota: ");
     double nota1 = scanner.nextDouble();

  System.out.println("Digite sua segunda nota: ");
     double nota2 = scanner.nextDouble();

  double mediaNota = (nota1 + nota2) /2;
        System.out.println("A média da sua nota é: " + mediaNota);

        if (mediaNota >= 0 && mediaNota < 4.0){
        System.out.println("Conceito: E");
     } else if (mediaNota >= 4.0 && mediaNota < 6.0 ){
         System.out.println("Conceito: D");
     } else if (mediaNota >=6.0 && mediaNota <= 7.5 ){
        System.out.println("Conceito: C");
     } else if (mediaNota > 7.5 && mediaNota < 9.0) {
        System.out.println("Conceito: B");
     } else if (mediaNota >= 9.0 && mediaNota <= 10.0){
        System.out.println("Conceito: A");
     }else{
         System.out.println("Nota inválida! ");
        }

    scanner.close();
    }
}