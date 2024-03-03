package test;

import src.interfaces.OutputConfig;

import java.util.ArrayList;
import java.util.List;

public class TestOutput implements OutputConfig {
    private final List<String> output = new ArrayList<>();


    public List<String> getOutput() {
        return output;
    }

    
}
