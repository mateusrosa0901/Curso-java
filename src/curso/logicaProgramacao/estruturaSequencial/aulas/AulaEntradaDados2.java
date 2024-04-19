package curso.logicaProgramacao.estruturaSequencial.aulas;

import java.util.Scanner;

public class AulaEntradaDados2 {
    public static void main(String[] args) {
        int num;
        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(num);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }

}
