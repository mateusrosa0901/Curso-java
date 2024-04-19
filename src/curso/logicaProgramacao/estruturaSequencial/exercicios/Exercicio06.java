package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("a | b | c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo = (a * c) / 2;
        double raio = 3.14159 * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("Triângulo: %.3f\n", triangulo);
        System.out.printf("Raio: %.3f\n", raio);
        System.out.printf("Trapézio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retângulo: %.3f", retangulo);

        sc.close();
    }
}
