package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        a = sc.nextInt();

        System.out.println("b: ");
        b = sc.nextInt();

        System.out.println("c: ");
        c = sc.nextInt();

        System.out.println("d: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.printf("Diferença: %d", diferenca);

        sc.close();
    }
}
