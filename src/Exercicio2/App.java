package Exercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*2) Faça um programa que receba a quantidade e o valor de 10 produtos. O
       programa deve calcular e exibir o valor total ao final da leitura. */

       try (Scanner sc = new Scanner(System.in)) {

           int quant;
           double valor;
           double valorTotal;

           for (int i = 1; i < 11; i++) {
               System.out.printf("informe a quantidade do produto %d: ",i);
               quant = sc.nextInt();
               System.out.printf("informe o valor do produto %d: ",i);
               valor = sc.nextDouble();

               valorTotal = valor * quant;
               System.out.println("O valor total é de : " + valorTotal);
           }
    }
    }
}
