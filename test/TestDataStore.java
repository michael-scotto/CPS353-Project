
public class TestDataStore implements DataStoreAPI, ReadAndWrite {
    
    @Override
	public Iterable<Integer> read(InputConfig input) {
		// Test code is allowed to assume it's getting the right types; this will fail with a ClassCastException if it gets
		// another type of input. For production code, we'd want some better user input validation
		return ((TestInput)input).getInput();
	}

	@Override
	public WriteResult appendSingleResult(OutputConfig output, String result) {
		// Test code is allowed to assume it's getting the right types; this will fail with a ClassCastException if it gets
		// another type of input. For production code, we'd want some better user input validation
		((TestOutput)output).getOutput().add(result);
		return () -> WriteResult.WriteResultStatus.SUCCESS;
	}
}
