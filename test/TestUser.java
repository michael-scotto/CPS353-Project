package test;

import src.interfaces.ComputationCoordinator;

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

        ComputeRequest request = new ComputeRequest ;

        //I could be completely off base with how this works
        InputConfig i = new InputConfig;

        //TODO: Add the input path and output path to the configs

        //Again, I could be completely off base with how this works- I can't find anything about how to define stuff for ComputeRequest
        //Consider this placeholder code. It's like psuedocode but instead of being fake it's just wrong, lol
        request.InputConfig = i;
        request.Delimiter = delimiter;

        new ComputeResult result = coordinator.compute(request);
    }

}
