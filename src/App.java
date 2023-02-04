import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Customer c1 = new Customer("Nilisha", "nilu@gmail.com", 0);
        Product p1 = new Product(1, "Bottle", "Milton", 1, 30);
        Product p2 = new Product(2, "Watch", "Titan", 3, 900);
        Product p3 = new Product(3, "Shoes", "Nike", 7, 1000);
        Product p4 = new Product(4, "Pencil", "Camlin", 20, 5);
        Product p5 = new Product(5, "Notebook", "Classmate", 15, 20);

        Inventory.prodList.add(p1);
        Inventory.prodList.add(p2);
        Inventory.prodList.add(p3);
        Inventory.prodList.add(p4);
        Inventory.prodList.add(p5);

        c1.greet();

        while (true) {
            System.out.println("--------------Product List---------------");
            for (Product p : Inventory.prodList) {
                System.out.println(p);
            }
            System.out.println("Which poduct do you want to buy?");
            int choice = scan.nextInt();
            c1.addToCart(choice);
            System.out.println("Do you want to continue(yes/no)?");
            String c = scan.next();
            if (c.toLowerCase().equals("no"))
                System.exit(0);
        }

    }
}
