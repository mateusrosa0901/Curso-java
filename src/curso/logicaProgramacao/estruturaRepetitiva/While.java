package curso.logicaProgramacao.estruturaRepetitiva;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int num;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (num != 0) {
            soma += num;
            num = sc.nextInt();
        }

        System.out.printf("Soma dos números digitados: %d", soma);

        sc.close();
    }
}
