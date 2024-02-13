package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalcComputeEngine {
    @Test
    public void calcComputeEngine() {

        TestInput input = new TestInput();

        //Creates an arraylist of the test values
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(25);

        input.TestInput(list);
        TestOutput output = new TestOutput();
        TestDataStore dataStore = new TestDataStore();
        //Creates simulated results to compare to the test
        TestOutput fake = new TestOutput();
        fake.TestOutput(dataStore.performOperation(input.input));

        //TODO: write results from empty implimentations to TestOutput, and compare to the simulated results
        output.TestOutput();


    }

}
