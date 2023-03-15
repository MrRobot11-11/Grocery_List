/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Assignment 6: Grocery List */
package lantz_grocerylist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    
    String line = null;
    
    WriteFile write = new WriteFile();
    
//Read contents of file 
    public void readFile(String fileName) {
        try {
            //Creating a file reader and passing name of file passed in
            FileReader fileReader = new FileReader(fileName);
        
          //Wrapping FileReader in BufferedReader.
            try (BufferedReader buffReader = new BufferedReader(fileReader)) {
                
                while ((line = buffReader.readLine()) != null) {
                    System.out.println(line);
                }
                //Always gotta close out the reader
                buffReader.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'"); 
        }
    }

//Reads grocery text file into an array
//Returns arraylist
//Only way I could figure out how to do this
    public List fillArray() {
        List<String> theList = null;
        try {
            theList = Files.readAllLines(Paths.get(write.getFILE_NAME()));
        } catch (Exception e) {
        }
        return theList;
    }
}//End of class
