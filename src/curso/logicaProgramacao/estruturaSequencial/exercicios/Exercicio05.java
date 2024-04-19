package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int code1, code2, qtd1, qtd2;
        double preco1, preco2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Peça 1: Código | Quantidade | Preço");
        code1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        System.out.println("Peça 2: Código | Quantidade | Preço");
        code2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        double total = (qtd1 * preco1) + (qtd2 * preco2);

        System.out.printf("Total: R$%.2f", total);

        sc.close();
    }
}
