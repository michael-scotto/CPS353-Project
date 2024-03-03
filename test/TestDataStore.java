package test;


import src.interfaces.DataStore;
import src.interfaces.WriteResult;
import src.interfaces.InputConfig;
import src.interfaces.OutputConfig;

public class TestDataStore implements DataStore {

    @Override
    public Iterable<Integer> read(InputConfig input) {

        return ((TestInput)input).getInputs();
    }

    @Override
    public WriteResult appendSingleResult(OutputConfig output, String result, char delimiter) {

        ((TestOutput)output).getOutput().add(result);
        return () -> WriteResult.WriteResultStatus.SUCCESS;
    }

}