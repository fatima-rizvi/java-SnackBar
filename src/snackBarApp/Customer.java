package snackBarApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  ///////Getters and setters

  //Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public double addCash(double add) {
    return this.cashOnHand += add;
  }

  public double buySnacks(double cost) {
    return this.cashOnHand -= cost;
  }

}
