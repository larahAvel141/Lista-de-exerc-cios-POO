package Exercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*1) Faça um programa para ler um valor inteiro e que imprima o seu
       antecessor e sucessor. */

       try (Scanner sc = new Scanner(System.in)) {
           int valor;
           int antecessor;
           int sucessor;

           System.out.println("Escreva o valor número que deseja:");
           valor = sc.nextInt();

           antecessor = valor - 1;
           sucessor = valor + 1;

           System.out.println("O antecessor do número " + valor + " é : " + antecessor);
           System.out.println("O sucessor do número " + valor + " é : " + sucessor);
    }

    }
}
