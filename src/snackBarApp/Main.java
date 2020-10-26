package snackBarApp;

public class Main {
  public static void main(String[] args) {

    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack s1 = new Snack("Chips", 1.75, v1.getId(), 36);
    Snack s2 = new Snack("Chocolate Bar", 1.00, v1.getId(), 36);
    Snack s3 = new Snack("Pretzel", 2.00, v1.getId(), 30);

    Snack s4 = new Snack("Soda", 2.50, v2.getId(), 24);
    Snack s5 = new Snack("Water", 2.75, v2.getId(), 20);

    //output
    System.out.println(s1.toString());
  }

}
