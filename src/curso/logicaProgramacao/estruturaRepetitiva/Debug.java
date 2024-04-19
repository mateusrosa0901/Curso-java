package curso.logicaProgramacao.estruturaRepetitiva;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        double area, altura, largura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Altura: ");
        altura = sc.nextDouble();

        System.out.println("Largura: ");
        largura = sc.nextDouble();

        area = altura * largura;

        System.out.printf("Área: %.2f%n", area);
    }
}
