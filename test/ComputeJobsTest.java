package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class ComputeJobsTest {
    @Test
	public void testComputeWorkflow() {
        ComputeEngine engine = new ComputeEngineImpl();
		
		TestDataStore testDs = new TestDataStore();
		
		ComputationCoordinator coord = new CoordinatorImpl(testDs, engine);
        
        
        TestInput input = new TestInput(1, 10, 25);

        TestOutput output = new TestOutput();

        ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
		when(mockRequest.getInputConfig()).thenReturn(input);
		when(mockRequest.getOutputConfig()).thenReturn(output);

        ComputeResult result = coord.compute(mockRequest);
		
		Assert.assertEquals(ComputeResult.SUCCESS, result);

        List<String> expected = new ArrayList<>();
		expected.add("1");
		expected.add("10");
		expected.add("25");
        
        Assert.assertEquals(expected, output.getOutputMutable());
    }

}
