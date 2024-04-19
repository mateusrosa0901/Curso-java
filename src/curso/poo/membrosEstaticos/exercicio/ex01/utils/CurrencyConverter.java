package curso.poo.membrosEstaticos.exercicio.ex01.utils;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double dollarQuanty) {
        double tot = dollarPrice * dollarQuanty;

        return tot + (tot * IOF);
    }
}
