package curso.logicaProgramacao.estruturaSequencial.aulas;

import java.util.Locale;

public class AulaSaidaDados {
    public static void main(String[] args) {
        double num1 = 3.5233;
        float num2 = 5.623f;

        System.out.println(num1);
        System.out.printf("%.3f%n", num1);
        System.out.printf("%.6f%n", num2);
        Locale.setDefault(Locale.US);
        System.out.printf("Num1: %.2f\nNum2: %.2f", num1, num2);
    }
}
