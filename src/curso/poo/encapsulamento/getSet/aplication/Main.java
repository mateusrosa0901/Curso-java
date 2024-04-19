package curso.poo.encapsulamento.getSet.aplication;

import curso.poo.encapsulamento.getSet.entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int quantity;

        System.out.println("New product: Name | Price | Quantity");
        name = sc.next();
        price = sc.nextDouble();
        quantity = sc.nextInt();

        Product pr = new Product(name, price, quantity);

        System.out.printf("Product data: %s%n", pr);

        System.out.println("Number of products to be added in stock: ");
        quantity = sc.nextInt();

        pr.addProducts(quantity);

        System.out.printf("Product data: %s%n", pr);

        System.out.println("Number of products to be removed in stock: ");
        quantity = sc.nextInt();

        pr.removeProducts(quantity);

        System.out.printf("Product data: %s%n", pr);

        sc.close();
    }
}
