package snackBarApp;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachId;

  public Snack (int id, String name, int quantity, double cost, int vendingMachId) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachId = vendingMachId;
  }

  /////getters and setters

  //getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getCost() {
    return cost;
  }

  public int getVendingMachId() {
    return vendingMachId;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setVendingMachId(int id) {
    this.id = id;
  }

  //other methods
  //add quantity when given how many to add
  public void addQuantity(int add){
    this.quantity = quantity + add;
  }
  // buy snack when given how many to buy
  public void buySnacks(int sub){
    this.quantity = quantity - sub;
  }

  // get total cost when given a quantity
  public double totalCost(int quantity){
    return quantity * cost;
  }

  @Override
  public String toString() {
    String rtnStr = "id: " + id + "\n" +
      "name: " + name + "\n" +
      "quantity: " + quantity + "\n" +
      "cost: " + cost  + "\n" +
      "vendingMachId: " + vendingMachId;
      return rtnStr;
  }

}
