import java.util.ArrayList;
import java.util.List;

public class TestDataStore implements DataStoreAPI, ReadAndWrite {
    private TestInput testInput;
    private TestOutput testOutput;

    public TestDataStore(TestInput testInput, TestOutput testOutput){
        this.testInput = testInput;
        this.testOutput = testOutput;
    }
    
    public void write(int input) {
        // Store value in test input
        testInput.getInput().add(value);
    }

    public String read() {
        return "";
    }

    public void storeIterations() {
    }

    public int getIterations(int input) {
        return 0;
    }

    //Read input
    public void readInput(List<Integer> data){
        testInput.getInput(data);
    }
    
    // Write data to the test output
    public void writeOutput(List<String> data) {
        testOutput.setOutput(data);
    }

    // Get test input
    public TestInput getTestInput() {
        return testInput;
    }

    // Get test output
    public TestOutput getTestOutput() {
        return testOutput;
    }
    
    //not sure here
    public List<String> performOperation(List<Integer> input){
        List<String> output;
        output = new ArrayList<>();
        //TODO: add something to determine the test output
        //Unsure what to do here - Should it create output data based on what we think would be correct?
        return output;
    }
}
