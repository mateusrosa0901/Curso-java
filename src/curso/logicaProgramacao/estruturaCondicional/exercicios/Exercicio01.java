package curso.logicaProgramacao.estruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println(num + " é um número positivo.");
        }
        else {
            System.out.println(num + " é um número negativo.");
        }

        sc.close();
    }
}
