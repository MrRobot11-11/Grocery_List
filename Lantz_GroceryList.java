/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: GroceryList*/
package lantz_grocerylist;


public class Lantz_GroceryList {

   
    public static void main(String[] args) {
        
        View ui = new View();
        Controller cntrl = new Controller();

    //Display intro and directions
        ui.intro();
        ui.directions();

    //Pass control to the controller
        cntrl.runApp();
    }

}
