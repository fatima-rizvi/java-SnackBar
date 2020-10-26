package snackBarApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(int id, String name, double cashOnHand) {
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

  public double getCashOnHanf() {
    return cashOnHand;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void addCash(double add) {
    this.cashOnHand += add;
  }

  public void buySnacks(double cost) {
    this.cashOnHand -= cost;
  }

}
