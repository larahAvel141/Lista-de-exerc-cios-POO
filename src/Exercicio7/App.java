package Exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*7) Faça um programa que leia N nomes de alunos e suas médias finais –
        sendo N informado pelo usuário – e que, ao final, forneça o percentual de
        alunos aprovados (média >= 6) e também os nomes e médias desses
        alunos. */

        try (Scanner sc = new Scanner(System.in)) {
            List<String> alunos = new ArrayList<>();
            List<Double> medias = new ArrayList<>();

            int numDeAlunos;
            String nomeDoAluno;
            Double mediasFinais;

            System.out.printf("Informe o número de alunos: ");
            numDeAlunos = sc.nextInt();

            for (int index = 1; index < numDeAlunos; index++) {
                System.out.printf("Informe o nome do aluno(a) %d: ",index);
                nomeDoAluno = sc.nextLine();
                System.out.printf("Informe a nota do aluno(a) %d: ",index);
                mediasFinais = sc.nextDouble();

                alunos.add(nomeDoAluno);
                medias.add(mediasFinais);

                if (mediasFinais >= 6) {
                    
                }

                
            }
        }

        



    }
}
