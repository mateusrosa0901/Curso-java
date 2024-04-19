package curso.poo.exercicios.ex02.aplication;

import curso.poo.exercicios.ex02.entities.Employes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salarioBruto, tax, porcentagem;

        System.out.println("Nome | Salário bruto | Taxa");
        nome = sc.next();
        salarioBruto = sc.nextDouble();
        tax = sc.nextDouble();

        Employes employes = new Employes(nome, salarioBruto, tax);

        System.out.println("Salário: " + employes);

        System.out.println("Porcentagem de aumento: ");
        porcentagem = sc.nextDouble();

        employes.aumentarSalario(porcentagem);

        System.out.println("Salário: " + employes);

        sc.close();
    }
}
