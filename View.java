/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: Grocery List */
package lantz_grocerylist;
import java.util.Scanner;
import java.util.List;

public class View {
    
    Scanner input = new Scanner(System.in);

//Displays all menu choices
    public void menu() {
        System.out.println("\nMain Menu");
        System.out.println("____________________________________");
        System.out.println("[1] Display All Items");
        System.out.println("[2] Add Items");
        System.out.println("[3] Delete Items ");
        System.out.println("[4] Exit the application");
        System.out.println("____________________________________");
    }

    
    public void intro() {
        try {
            System.out.println("\nWelcome to the Grocery List App!");
            Thread.sleep(2000);
            System.out.println("\nKeep your list organized and never forget an item again!");
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void directions(){
        try {
            System.out.println("\nYou can add an item, delete an item, or display your list.");
            Thread.sleep(2000);
            System.out.println("\nThe app will remain open until you choose to exit.");
            Thread.sleep(2000);
            
        } catch (Exception e) {
        }
}

//Prints grocery list items
//Does not print null or empty items  
  public void displayList(List<String> groceryList) {
        System.out.println("\nGrocery List");
        System.out.println();
       
        for (int i = 0; i < groceryList.size(); i++) {
            if (!groceryList.get(i).isEmpty()) {
                System.out.print((i + 1) + ":  ");
                System.out.println(groceryList.get(i));
            }
        }
    }

  public String userInput(){
      String listItem;
      System.out.println("\nEnter a grocery list item or [enter] to exit:");
      return listItem = input.nextLine();
  }
    
  public String deleteItem(){
      String itemToDelete;
      System.out.println("\nEnter the item that you would like to delete from the list"
              + "\nor press enter to return to main menu:");
      return itemToDelete = input.nextLine();
  }

}//End of class
  

