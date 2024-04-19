package curso.poo.membrosEstaticos.aula.ver02.aplication;

import curso.poo.membrosEstaticos.aula.ver02.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Radious: ");
        double radius = sc.nextDouble();

        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calculator.PI);

        sc.close();
    }
}
