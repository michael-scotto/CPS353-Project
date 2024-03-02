package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.interfaces.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


public class ComputeEngineIntegrationTest {

        @Test
        public void testComputeWorkflow() {

            ComputeEngine engine = new ComputeJobsImplementation();

            // Why is this an actual implementation and not a mock? With enough work, we could actually use
            // mock objects to do this, but in general if you've got any actual logic to put into the methods,
            // use a test-only implementation rather than building it at runtime with a mock
            TestDataStore testDs = new TestDataStore();

            ComputationCoordinator coord = new CoordinatorImpl(testDs, engine);

            // Using the variable-length int constructor to avoid having to create an array and manually add all these values
            // Small usability improvements add up over time, by the 5th or 10th test with this data type, this is
            // going to seem really nice
            TestInput input = new TestInput(1, 10, 25);

            TestOutput output = new TestOutput();

            // This could be a real implementation, a test implementation, or a mock; any of those is fine to use here
            ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
            when(mockRequest.getInputConfig()).thenReturn(input);
            when(mockRequest.getOutputConfig()).thenReturn(output);

            // Note: should we have a delimiter? That's an implementation detail, and we can change the test depending on how the implementation actually
            // shakes out around handling defaults

            ComputeResult result = coord.compute(mockRequest);

            Assert.assertEquals(ComputeResult.SUCCESS, result);

            // Here, we're going to check the computation actually worked. What that means will depend on your computation.
            // In this case, the expected output of a computation is just calling toString on the Integer (note: don't do this for your computation,
            // it is very much *not* CPU intensive)
            List<String> expected = new ArrayList<>();
            expected.add("1");
            expected.add("10");
            expected.add("25");

            // If everything worked, we should have written out these results to the output
            Assert.assertEquals(expected, output.getOutput());
        }

}
