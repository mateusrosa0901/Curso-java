package curso.poo.exercicios.ex03.aplication;

import curso.poo.exercicios.ex03.entities.Boletim;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double tri1, tri2, tri3;

        System.out.println("Nome | 1 | 2 | 3");
        nome = sc.next();
        tri1 = sc.nextDouble();
        tri2 = sc.nextDouble();
        tri3 = sc.nextDouble();

        Boletim boletim = new Boletim(nome, tri1, tri2, tri3);

        System.out.println("Final grade: " + boletim);

        sc.close();

    }
}
