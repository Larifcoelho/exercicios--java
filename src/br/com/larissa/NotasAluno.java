package br.com.larissa;

import java.util.Scanner;

 class NotasAluno {
 public static void main(String[] args ) {

  Scanner scanner = new Scanner(System.in);

 System.out.println("Digite a sua nota na A1: ");
  int nota1 = scanner.nextInt();

 System.out.println("Digite sua nota na A2: ");
 int nota2 = scanner.nextInt();

 System.out.println("Digite sua nota na A3: ");
 int nota3 = scanner.nextInt();

 int soma = nota1 + nota2 + nota3;

 if (soma <= 0) {
  System.out.println("Número inválido. Digite um número. ");
 }
  else if (soma >= 70) {
   System.out.println("APROVADO(a) ");
 }
  else if (soma >= 40 && soma < 70) {
   System.out.println("DEPENDÊNCIA ");
  }
   else if (soma <= 40) {
    System.out.println("REPROVADO(a) ");
  }

  scanner.close();






  }
 }
