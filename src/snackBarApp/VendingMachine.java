package snackBarApp;

public class VendingMachine {
  private static int maxId = 0;
  private int id;
  private String name;

  public VendingMachine(String name) {
    maxId++;
    this.id = maxId;
    this.name = name;
  }
    ///////getters and setters

    //getters
    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    //setters
    public void setName() {
      this.name = name;
    }

}
