package src.Interface;
import java.util.ArrayList;
import java.util.List;

public class UserAPIImplementation implements UserAPI {
    private DataStoreAPI dataStoreAPI; // Instance variable for DataStoreAPI
    
    public UserAPIImplementation(DataStoreAPI dataStoreAPI) {
        this.dataStoreAPI = dataStoreAPI;
    }
    
    public void setInput(int input) {
        // No implementation yet
    }

    @Override
    public String inputDelimeter(String delim1) {
        return null;
    }

    @Override
    public String outputDelimeter(String delim2) {
        return null;
    }

    public String inputDelimiter(String delim1) {
        // No implementation yet
        return "";
    }

    public String outputDelimiter(String delim2) {
        // No implementation yet
        return "";
    }

    public void executeJob(String outputDelimeterResult) {
        // No implementation yet
    }

    public void storeData(List data) {
        // No implementation yet
    }
}
