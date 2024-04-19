package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double pi, raio, area;
        Scanner sc = new Scanner(System.in);
        pi = 3.14159;

        System.out.println("Raio: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.printf("Área: %.4f", area);

        sc.close();
    }
}
