

import interfaces.InputConfig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestInput implements InputConfig {

    private final List<Integer> inputs = new ArrayList<>();


    public TestInput(int... inputs) {
        for (int i : inputs) {
            this.inputs.add(i);
        }
    }

    public TestInput(Collection<Integer> inputs) {

        this.inputs.addAll(inputs);
    }

    // Note that this means the class isn't actually immutable, because we're
    // returning the actual inputs; to be truly immutable, we would either use an
    // ImmutableList in the first place (ideal), or return a copy of the list (return new ArrayList<>(inputs))
    // but since this is test code, YOLO
    public List<Integer> getInputs() {
        return inputs;
    }
}
