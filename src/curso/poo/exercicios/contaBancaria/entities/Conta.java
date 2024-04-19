package curso.poo.exercicios.contaBancaria.entities;

public class Conta {
    private int numConta;
    private String nome;
    private double saldo;

    public Conta(int numConta, String nome, double valor) {
        this.numConta = numConta;
        this.nome = nome;
        deposito(valor);
    }

    public Conta(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo = saldo - valor - 5.00;
    }

    @Override
    public String toString() {
        return  "Conta: " + numConta +
                ", Nome: '" + nome + '\'' +
                ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}
