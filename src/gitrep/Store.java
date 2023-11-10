package gitrep;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0;
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList<>();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index > itemList.size()){
        System.out.printf("What do you mean %d?! There are only %d items in %s...\n", index,itemList.size(), this.name);
    }else {
        // get Item at index from itemList and add its cost to earnings
        Item item = itemList.get(index);
        this.earnings += item.getCost();
        // print statement indicating the sale
        System.out.printf("\nSold %s!!!\n", item.getName());
    }
  }
  public void sellItem(String name){
      // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
      boolean hasItem = false;
      for (int i = 0; i < itemList.size(); i++) {
        Item item = itemList.get(i);
        if (item.getName().equalsIgnoreCase(name)){
            // get Item from itemList and add its cost to earnings
            this.earnings += item.getCost();
            // print statement indicating the sale
            System.out.printf("Sold %s!!!\n", item.getName());
            hasItem = true;
            break;
          }
      }
      
      if (!hasItem){
        System.out.println("Um... " + this.name + " doesn't sell " + name + "...");
      }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if(itemList.contains(i)){
        // get Item i from itemList and add its cost to earnings
        this.earnings += i.getCost();
        // print statement indicating the sale
        System.out.printf("Sold %s!!!\n", i.getName());
    } else {
        System.out.printf("Um... %s doesn't sell %s...\n", this.name, i.getName());
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("%s ITEMS: ", type.toUpperCase());
    for(Item item : itemList) {
        if (item.getType().equalsIgnoreCase(type)){
            System.out.print(item.getName() + " ");
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.print("\nITEMS MAX " + maxCost + ": ");
    for(Item item : itemList) {
        if (item.getCost() <= maxCost){
            System.out.print(item.getName() + " ");
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified
    System.out.print("\nITEMS MIN " + minCost + ": ");
    for(Item item : itemList) {
        if (item.getCost() >= minCost){
            System.out.print(item.getName() + " ");
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store store : storeList) {
        System.out.println(store.name + " earned " + store.earnings);
    }
  }
}
