package Exercicio10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*10) Faça um programa que solicite um valor de 1 a 12 correspondendo a
        um mês do ano, e imprima o nome do mês por extenso. Trate as entradas
        inadequadas. */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Digite o número para descobrir o mês : ");
            int numero = sc.nextInt();

            if (numero == 1) {
                System.out.printf("Mês %d é Janeiro",numero);
            } 
            if (numero == 2) {
                System.out.printf("Mês %d é Fevereiro",numero);
            }
            if (numero == 3) {
                System.out.printf("Mês %d é Março",numero);
            }
            if (numero == 4) {
                System.out.printf("Mês %d é Abril",numero);
            }
            if (numero == 5) {
                System.out.printf("Mês %d é Maio",numero);
            }
            if (numero == 6) {
                System.out.printf("Mês %d é Junho",numero);
            }
            if (numero == 7) {
                System.out.printf("Mês %d é Julho",numero);
            }
            if (numero == 8) {
                System.out.printf("Mês %d é Agosto",numero);
            }
            if (numero == 9) {
                System.out.printf("Mês %d é Setembro",numero);
            }
            if (numero == 10) {
                System.out.printf("Mês %d é Outubro",numero);
            }
            if (numero == 11) {
                System.out.printf("Mês %d é Novembro",numero);
            }
            if (numero == 12) {
                System.out.printf("Mês %d é Dezembro",numero);
            }
        } 
    }
}
