public class Product {
    String name;
    int id;
    String brand;
    long qty;
    double price;

    public Product(int id, String name, String brand, long qty, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + id + " [Name : " + name + ", Brand : " + brand + ", Quantity : " + qty + ", Price : "
                + price + "]";
    }

}