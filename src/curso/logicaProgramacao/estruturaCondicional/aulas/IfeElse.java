package curso.logicaProgramacao.estruturaCondicional.aulas;

import java.util.Scanner;

public class IfeElse {
    public static void main(String[] args) {
        int horas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas: ");
        horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom Dia!");
        }
        else if (horas < 18) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }


        sc.close();
    }
}
