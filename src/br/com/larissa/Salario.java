package br.com.larissa;

import java.util.Scanner;

public class Salario {
    public static void main(String [] args){

      Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor do salário bruto: R$ ");
           double salarioBruto = scanner.nextDouble();

            double descontoSindicato = salarioBruto * 0.03;

            double descontoIR;

                if (salarioBruto <= 1200.00) {
                    descontoIR = 0.0;
                } else if (salarioBruto <= 2500.00) {
                    descontoIR = salarioBruto * 0.05;
                } else if (salarioBruto <= 3500.00) {
                    descontoIR = salarioBruto * 0.10;
                } else if (salarioBruto <= 5500.00) {
                    descontoIR = salarioBruto * 0.20;
                } else {
                    descontoIR = 0.0;
                }

            double salarioLiquido = salarioBruto - descontoSindicato - descontoIR;

                System.out.println("\n--- Folha de Pagamento ---");

                System.out.println("Salário Bruto: R$ " + salarioBruto);

                System.out.println("Desconto Sindicato (3%): R$ " + descontoSindicato);

                System.out.println("Desconto IR: R$ " + descontoIR);

                System.out.println("Salário Líquido: R$ " + salarioLiquido);

            }
        }



