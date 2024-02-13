package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalcComputeEngine {
    @Test
    public void calcComputeEngine() {

        TestInput input = new TestInput();

        //add 1, 10, 25 to arraylist
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(25);

        //calling testInput with list to "test" TestInput class with a specific inital input
        input.TestInput(list);

        //calling TestOutput with same list to be tested with a specific intial input
        TestOutput output = new TestOutput();
        output.TestOutput(list);
        
        //throwing list into dataStore for possible future use of list
        TestDataStore dataStore = new TestDataStore();
        dataStore.performOperation(list);


    }

}
