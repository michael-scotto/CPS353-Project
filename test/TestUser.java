

import interfaces.ComputationCoordinator;
import interfaces.InputConfig;
import interfaces.FileInputConfig;
import interfaces.OutputConfig;
import interfaces.FileOutputConfig;
import interfaces.ComputeRequest;
import interfaces.ComputeResult;

import java.io.File;


public class TestUser {

    // TODO 3 (done): change the type of this variable to the name you're using for your
    // User <-> ComputeEngine API; also update the parameter passed to the constructor
    private final ComputationCoordinator coordinator;

    public TestUser(ComputationCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public void run(String outputPath) {
        char delimiter = ';';
        String inputPath = "test" + File.separatorChar + "testInputFile.test";

        // TODO 4: Call the appropriate method(s) on the coordinator to get it to
        // run the compute job specified by inputPath, outputPath, and delimiter

        ComputeRequest request = new ComputeRequest() {
            @Override
            public InputConfig getInputConfig() {
                return null;
            }

            @Override
            public OutputConfig getOutputConfig() {
                return null;
            }

            @Override
            public char getDelimeter() {
                return delimiter;
            }
        };


        //TODO: Add the input path and output path to the configs


        InputConfig inputConfig = new FileInputConfig(inputPath);

        OutputConfig outputConfig = new FileOutputConfig(outputPath);

        ComputeResult result = coordinator.compute(request);
    }

}
