/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: Grocery List */
package lantz_grocerylist;
import java.util.Scanner;

//Class that will hold methods for testing user input
public class TestInput {

    Scanner input = new Scanner(System.in);

//Tests user input for correct type and value
//Will test between a range of values
    public int getChoiceRange(int highValue, int lowValue){
        System.out.print("\nPlease enter your choice: ");

        boolean isNumber = true;
        int userChoice = -1;

        while (isNumber) {
            if (input.hasNextInt()) {
                userChoice = input.nextInt();
                if (userChoice > highValue || userChoice < lowValue) {
                    System.out.print("\nPlease enter a number between " + lowValue+ " and " + highValue + ": ");
                } else {
                    isNumber = false;
                }
            } else {
                System.out.print("\nMenu selection must be a number between 1-4. "
                        + " Please try again: ");
                input.next();
            }
        }
        return userChoice;
}

//Asks the user to press enter to continue 
    public void pressEnter() {
        System.out.println("\nPress [enter] to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}//End of class
