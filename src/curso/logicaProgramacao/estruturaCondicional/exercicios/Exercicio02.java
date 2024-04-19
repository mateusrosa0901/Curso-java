package curso.logicaProgramacao.estruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        }
        else {
            System.out.println(num + " é ímpar.");
        }

        sc.close();
    }
}
