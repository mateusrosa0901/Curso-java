package curso.poo.membrosEstaticos.aula.ver01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = sc.nextDouble();
        double c = circumference(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * PI * Math.pow(raio, 3) / 3;
    }


}
