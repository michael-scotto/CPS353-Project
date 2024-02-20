import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class TestInput {
    private final List<Integer> input = new ArrayList<>();
    
    public TestInput(int... input) {
		for (int i : input) {
			this.input.add(i);
		}
	}

    public InMemoryInputConfig(Collection<Integer> input) {
		this.input.addAll(input);
	}
    
    public List<Integer> getInput(){
        return input;
    }

    public setInput(List<Integer> input){
        this.input = input;
    }
}
