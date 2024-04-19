package curso.poo.exercicios.contaBancaria.aplication;

import curso.poo.exercicios.contaBancaria.entities.Conta;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Número da conta: ");
        int numConta = sc.nextInt();

        System.out.print("Nome do titular da conta: ");
        String nome = sc.next();

        System.out.print("Depósito inicial? (s/n): ");
        char op = sc.next().toLowerCase().strip().charAt(0);

        if (op == 's') {
            System.out.print("Valor do depósito: R$ ");
            double valor = sc.nextDouble();
            conta = new Conta(numConta, nome, valor);
        }
        else {
            conta = new Conta(numConta, nome);
        }


        System.out.print("Dados da conta: ");
        System.out.println(conta);

        System.out.print("Valor do depósito: R$ ");
        double valor = sc.nextDouble();

        conta.deposito(valor);

        System.out.print("Dados da conta: ");
        System.out.println(conta);

        System.out.print("Valor do saque: R$ ");
        valor = sc.nextDouble();

        conta.saque(valor);

        System.out.print("Dados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
