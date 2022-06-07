package Exercicio5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*5) Crie um programa que imprima os ímpares de 1 até N, sendo N solicitado
        ao usuário. */

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.printf("Digite o número que deseja: ");
            int numero = sc.nextInt();
            
            for (int index = 1; index < numero; index++) {

                if (index % 2 != 0) {
                    System.out.println("Números impáres:\n" + index);
                }
            }
        }
    }
}
