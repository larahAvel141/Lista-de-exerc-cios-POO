package Exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*4) Faça um programa para ler três valores decimais que correspondem aos
        lados de um triângulo e, depois, se é um triângulo eqüilátero, isóscele ou
        escaleno. */

        try (Scanner sc = new Scanner(System.in)) {

            double valor1;
            double valor2;
            double valor3;

            System.out.printf("Insira o valor do lado 1: ");
            valor1 = sc.nextDouble();
            System.out.printf("Insira o valor do lado 2: ");
            valor2 = sc.nextDouble();
            System.out.printf("Insira o valor do lado 3: ");
            valor3 = sc.nextDouble();

            if (valor1 == valor2 ) {
                if (valor2 == valor3) {
                    System.out.println("O triângulo é do tipo equilátero!");
                }
            }
            if (valor1 == valor2) {
                if (valor2 != valor3) {
                    System.out.println("O triângulo é do tipo isósceles!");
                }
            } 
            else {
                System.out.println("O triângulo é do tipo escaleno!");
            }
        }
    }
}
