package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalcComputeEngine {
    @Test
    public void calcComputeEngine() {

        TestInput input = new TestInput();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(25);

        input.TestInput(list);

        TestOutput output = new TestOutput();
        output.TestOutput(list);

        TestDataStore dataStore = new TestDataStore();
        dataStore.performOperation(list);


    }

}
