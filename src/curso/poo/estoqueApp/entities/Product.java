package curso.poo.estoqueApp.entities;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        double totalValue = totalValueInStock();

        return name
            + ", $ "
            + String.format("%.2f", price)
            + " "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValue);
    }
}
