package curso.poo.exercicios.ex01.aplication;

import curso.poo.exercicios.ex01.entities.Rectangle;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;

        System.out.println("Enter rectangle width | height");
        width = sc.nextDouble();
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
    }
}
