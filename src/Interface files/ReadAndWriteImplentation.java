package src;

import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteImplementation implements ReadAndWrite {
    private DatabaseConnection databaseConnection;
    //Constructor for connecting to future database
    public ReadAndWriteImplementation(DatabaseConnection databaseConnection){
        this.databaseConnection = databaseConnection
    }
    //Writes to the database. int input is provisionary
    public void write(int input){
    
    }
    //Reads from the database
    public String read(){
    return "";
    }
    //we might need more methods to retrieve specific things from the database.

    //Not sure if we need these
    int input;
    List<Integer> iterationStorage = new ArrayList<Integer>();
}
