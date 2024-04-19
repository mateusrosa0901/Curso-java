package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Num1: ");
        num1 = sc.nextInt();

        System.out.println("Num2: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
