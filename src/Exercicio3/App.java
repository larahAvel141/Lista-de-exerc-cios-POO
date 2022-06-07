package Exercicio3;

import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        /*3) Faça um programa que receba a largura e o comprimento de um lote de
        terra e mostre a área total existente em metros quadrados. */

        try (Scanner sc = new Scanner(System.in)) {
            
            int largura;
            int comprimento;
            int areaTotal;

            System.out.printf("Informe a largura do lote: ");
            largura = sc.nextInt();
            System.out.printf("Informe o comprimento do lote: ");
            comprimento = sc.nextInt();

            areaTotal = comprimento * largura;

            System.out.printf("A área total do lote é de %d m2",areaTotal);
        }

    }
}
