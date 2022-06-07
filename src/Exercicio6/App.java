package Exercicio6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*6) Faça um programa que solicite dois valores e imprima todos os pares
        entre o menor valor e o maior valor. Caso os números digitados sejam
        iguais, enviar mensagem ao usuário e imprimir os pares de 1 a 10 como
        exemplo. */

        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.printf("Digite o primeiro valor :");
        valor1 = sc.nextInt();
        System.out.printf("Digite o segundo valor :");
        valor2 = sc.nextInt();


        if (valor1 < valor2) {
            for (int index = valor1; index < valor2 + 1; index++) {
                System.out.printf("Pares entre esses números:");
                System.out.println(index);
            }
        }
        if (valor1 > valor2) {
            for (int index = valor2; index < valor1 + 1; index++) {
                System.out.printf("Pares entre esses números:");
                System.out.println(index);
            }
        }
        if (valor1 == valor2) {
            sc.nextLine();
            System.out.println("Os números não podem ser iguais!");
            System.out.println("Exemplo:");
            System.out.println("Digite um valor maior e outro menor!");
            System.out.println("1 e 10!");
            System.out.printf("Pares entre esses números:");
            sc.nextLine();

            for (int index = 1; index < 10 + 1; index++) {
                System.out.println(index);
            }
            sc.close();
        }
    }
}
