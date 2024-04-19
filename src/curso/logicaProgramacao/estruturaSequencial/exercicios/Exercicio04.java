package curso.logicaProgramacao.estruturaSequencial.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int funcionario, horas;
        double salarioHora, salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("ID funcionário: ");
        funcionario = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        horas = sc.nextInt();

        System.out.println("Valor da hora: ");
        salarioHora = sc.nextDouble();

        salario = horas * salarioHora;

        System.out.printf("Funcionário = %d\n", funcionario);
        System.out.printf("Salário: U$ %.2f", salario);

        sc.close();
    }
}
