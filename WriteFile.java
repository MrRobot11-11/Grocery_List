/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: Grocery List */
package lantz_grocerylist;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;

public class WriteFile {

    private final String FILE_NAME = "groceryList.txt";
    private List<String> theList = new ArrayList();

//One arg constructor
//Fill theList arraylist from arraylist passed in
    public WriteFile(List<String> list) {

        for (String var : list) {
            theList.add(var);
        }
    }

//No args constructor
    public WriteFile() {
    }

//Accessors/mutators
       public List<String> getTheList() {
        return theList;
    }
       public void setTheList(ArrayList<String> theList) {
        this.theList = theList;
    }
       
       public String getFILE_NAME() {
        return FILE_NAME;
    }

//Remove items from the grocery list
    public void deleteGroceryItem(String itemToRemove) {
        theList.remove(itemToRemove);
    }
    
//Add items to the grocery list
    public void fillGroceryArray(String listItem) {
        theList.add(listItem);
    }

//Will write file one line at a time 
    public void writeFile() {
        try {
            //Creating new fileWriter; fileName is groceryList
            FileWriter fileWriter = new FileWriter(FILE_NAME); //true means append, don't overwrite

            // Always wrap FileReader in BufferedReader.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Loop to write to file from arraylist items
            for (String var : theList) {
                bufferedWriter.write(var);
                bufferedWriter.newLine();  //write line by line
            }

            // Always close files.
            bufferedWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + FILE_NAME + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error writing file '"
                    + FILE_NAME + "'");

        }
    }//End of writeFile

 

}//End of class
