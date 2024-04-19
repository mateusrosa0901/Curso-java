package curso.logicaProgramacao.estruturaSequencial.aulas;

import java.util.Scanner;

public class AulaEntradaDados1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("Número digitado: %d", num);
    }
}
