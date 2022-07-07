public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    Store bobaPlace = new Store("bubble tea", 260, 2.25);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at $" + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");

    System.out.println("The third shop has " + bobaPlace.inventoryCount + " units of " + bobaPlace.productType + " for $" + bobaPlace.inventoryPrice + " each!");
  }
}
