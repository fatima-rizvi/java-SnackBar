package snackBarApp;

import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {

    DecimalFormat decForm = new DecimalFormat("$#,##0.00");

    // (String name, double cashOnHand)
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // (String name)
    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    // (String name, int quantity, double cost, int vendingMachId)
    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    ///// processing and output

    //Jane buys 3 sodas
    jane.buySnacks(soda.totalCost(3));
    soda.buySnacks(3);

    System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
    System.out.println("Quantity left of " + soda.getName() + ": " + soda.getQuantity());
    System.out.println();

    //Jane buys 1 pretzel
    jane.buySnacks(pretzel.totalCost(1));
    pretzel.buySnacks(1);

    System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
    System.out.println("Quantity left of " + pretzel.getName() + ": " + pretzel.getQuantity());
    System.out.println();

    //Bob buys 2 sodas
    bob.buySnacks(soda.totalCost(2));
    soda.buySnacks(2);

    System.out.println(bob.getName() + " cash on hand $" + bob.getCashOnHand());
    System.out.println("Quantity left of " + soda.getName() + ": " + soda.getQuantity());
    System.out.println();

    //Jane finds $10
    jane.addCash(10);

    System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
    System.out.println();

    //Jane buys 1 chocolate bar
    jane.buySnacks(chocolate.totalCost(1));
    chocolate.buySnacks(1);

    System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
    System.out.println("Quantity left of " + chocolate.getName() + ": " + chocolate.getQuantity());
    System.out.println();

    //Add 12 more pretzels
    pretzel.addQuantity(12);
    System.out.println("Quantity of " + pretzel.getName() + ": " + pretzel.getQuantity());

    //Bob buys 3 pretzels
    bob.buySnacks(pretzel.totalCost(3));
    pretzel.buySnacks(3);

    System.out.println(bob.getName() + " cash on hand $" + bob.getCashOnHand());
    System.out.println("Quantity left of " + pretzel.getName() + ": " + pretzel.getQuantity());
    System.out.println();

    //Stretch goals
     System.out.println("Stretch Goals:");
     System.out.println();

     //Display each snack with name, vending machine name, quantity, total cost of entire quantity

    // double totalCostChips = chips.getCost() * chips.getQuantity();
		// System.out.println("Total Cost: " + decForm.format(totalCostChips));

     // chips
     System.out.println("Snack: " + chips.getName());
     System.out.println("Vending Machine: " + food.getName());
     System.out.println("Quantity: " + chips.getQuantity());
     double totalCostChips = chips.getCost() * chips.getQuantity();
		 System.out.println("Total Cost: " + decForm.format(totalCostChips));
     System.out.println();

     // chocolate bar
     System.out.println("Snack: " + chocolate.getName());
     System.out.println("Vending Machine: " + food.getName());
     System.out.println("Quantity: " + chocolate.getQuantity());
     double totalCostChocolate = chocolate.getCost() * chocolate.getQuantity();
		 System.out.println("Total Cost: " + decForm.format(totalCostChocolate));
     System.out.println();

     // pretzel
     System.out.println("Snack: " + pretzel.getName());
     System.out.println("Vending Machine: " + food.getName());
     System.out.println("Quantity: " + pretzel.getQuantity());
     double totalCostPretzel = pretzel.getCost() * pretzel.getQuantity();
		 System.out.println("Total Cost: " + decForm.format(totalCostPretzel));
     System.out.println();

     // soda
     System.out.println("Snack: " + soda.getName());
     System.out.println("Vending Machine: " + drink.getName());
     System.out.println("Quantity: " + soda.getQuantity());
     double totalCostSoda = soda.getCost() * soda.getQuantity();
		 System.out.println("Total Cost: " + decForm.format(totalCostSoda));
     System.out.println();

     // water
     System.out.println("Snack: " + water.getName());
     System.out.println("Vending Machine: " + drink.getName());
     System.out.println("Quantity: " + water.getQuantity());
     double totalCostWater = water.getCost() * water.getQuantity();
		 System.out.println("Total Cost: " + decForm.format(totalCostWater));
     System.out.println();

  }

}
