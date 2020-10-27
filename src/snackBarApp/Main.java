package snackBarApp;

public class Main {
  public static void main(String[] args) {

    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    System.out.println(jane.getName() + " cash on hand " + jane.getCashOnHand());

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    // (String name, int quantity, double cost, int vendingMachId)
    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    //output

  }

}
