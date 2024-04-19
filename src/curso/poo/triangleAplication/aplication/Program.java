package curso.poo.triangleAplication.aplication;

import curso.poo.triangleAplication.entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        System.out.println("Primeiro triângulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        y = new Triangle();
        System.out.println("Segundo triângulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do primeiro triângulo: %.4f%n", areaX);
        System.out.printf("Área do segundo triângulo: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A área do primeiro triângulo é maior.");
        }
        else {
            System.out.println("A área do segundo triângulo é maior.");
        }

        sc.close();
    }
}
