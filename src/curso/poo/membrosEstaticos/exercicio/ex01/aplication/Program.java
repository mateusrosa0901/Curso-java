package curso.poo.membrosEstaticos.exercicio.ex01.aplication;

import curso.poo.membrosEstaticos.exercicio.ex01.utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Dollar quanty: ");
        double dollarQuanty = sc.nextDouble();

        System.out.println("Price: R$ "
                + String.format("%.2f",
                CurrencyConverter.converter(dollarPrice, dollarQuanty)));
    }
}
