package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class UserAPITest {

    @Test
    public void testSetInput() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        int input = 10;

        userAPI.setInput(input);

    }

    @Test
    public void testInputDelimiter() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        String delimiter = ",";

        String result = userAPI.inputDelimiter(delimiter);

        assert result.isEmpty();
    }

    @Test
    public void testOutputDelimiter() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        String delimiter = ";";

        String result = userAPI.outputDelimiter(delimiter);

        assert result.isEmpty();
    }

    @Test
    public void testExecuteJob() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        String output = "result";

        userAPI.executeJob(output);

    }

    @Test
    public void testStoreData() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        List<String> data = new ArrayList<>();
        data.add("data1");
        data.add("data2");

        userAPI.storeData(data);

    }

    // Smoke Tests

    @Test
    public void smokeTestInputAndOutputDelimiters() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        String inputDelimiter = ",";
        String outputDelimiter = ";";

        userAPI.inputDelimiter(inputDelimiter);
        userAPI.outputDelimiter(outputDelimiter);
    }

    @Test
    public void smokeTestExecuteJob() {
        DataStoreAPI dataStoreAPI = Mockito.mock(DataStoreAPI.class);
        UserAPIImpl userAPI = new UserAPIImplementation(dataStoreAPI);
        String output = "result";

        userAPI.executeJob(output);

        // No need to verify individual method calls in a smoke test
    }
}
