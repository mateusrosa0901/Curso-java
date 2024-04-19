package curso.poo.exercicios.ex03.entities;

public class Boletim {
    String nome;
    double tri1, tri2, tri3, total;

    public Boletim (String nome, double tri1, double tri2, double tri3) {
        this.nome = nome;
        this.tri1 = tri1;
        this.tri2 = tri2;
        this.tri3 = tri3;
        total = tri1 + tri2 + tri3;
    }

    public double total () {
        return tri1 + tri2 + tri3;
    }

    public boolean situacao () {
        if (total >= 60) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString () {
        boolean situacao = situacao();

        if (situacao) {
            return "Pass: " + String.format("%.2f", total);
        }
        else {
            return "Failed"
                    + "\n"
                    + "Missing: "
                    + String.format("%.2f", 60 - total)
                    + " points.";
        }
    }
}
