package curso.poo.exercicios.ex02.entities;

public class Employes {
    String nome;
    double salarioBruto;
    double tax;

    public Employes (String nome, double salarioBruto, double tax) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.tax = tax;
    }

    public String toString () {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }

    public double salarioLiquido () {
        double salarioLiquido = salarioBruto - tax;

        return salarioLiquido;
    }

    public void aumentarSalario (double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }
}
