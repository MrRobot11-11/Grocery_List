
/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: Grocery List */
package lantz_grocerylist;

public class Controller {
    
    boolean exit = false;
    
    View ui = new View();
    TestInput test = new TestInput();
    ReadFile read = new ReadFile();
    WriteFile write = new WriteFile(read.fillArray());
    
    
    public void runApp() {
  
        do {
            //Display main menu     
            ui.menu();
            
            switch (test.getChoiceRange(4, 1)) {
                case 1://Display all items
                    ui.displayList(write.getTheList());
                    test.pressEnter();//Holds screen until user presses enter
                    break;
                case 2://Add items
                    writeGroceryList();//Fill grocery list from user input
                    break;
                case 3: //Delete items
                  removeFromList();
                  break;
                case 4: //Exit the app
                    write.writeFile();//Write to file from grocery array list
                    exit = true;
                    break;
            }
        } while (!exit);
    
    }//End of controller

//Fill grocery list from user input
    public void writeGroceryList() {
        String newItem = " ";
        
        while (!newItem.isEmpty()) {
            newItem = ui.userInput();
            write.fillGroceryArray(newItem);
        }
    }

//Remove an item from the grocery list
    public void removeFromList(){
    String newItem = " ";
    
    while(!newItem.isEmpty()){
        newItem = ui.deleteItem();
        write.deleteGroceryItem(newItem);
    }
}
}//End of class
