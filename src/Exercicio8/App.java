package Exercicio8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Crie um programa que apresente o fatorial de um número N informado
        pelo usuário. */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Dgite o número: ");
            int numero = sc.nextInt();
            int fat = 1;

            while (numero > 0) {
                fat = fat * numero--;
            }
            System.out.println("O fatorial deste número é : " + fat);
        }
        
    }
}
