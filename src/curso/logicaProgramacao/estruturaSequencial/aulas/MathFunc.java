package curso.logicaProgramacao.estruturaSequencial.aulas;

import java.util.Locale;
import java.util.Scanner;
public class MathFunc {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        a = sc.nextDouble();

        System.out.print("b: ");
        b = sc.nextDouble();

        System.out.print("c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        Locale.setDefault(Locale.US);
        System.out.printf("Delta: %.2f\n", delta);
        System.out.printf("x1: %.2f\n", x1);
        System.out.printf("x2: %.2f", x2);

        sc.close();
    }
}
