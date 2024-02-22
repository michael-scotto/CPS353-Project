package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ComputeJobsTest {
    @Test
	public void smokeTestCompute() {
		// The computation component has very simple inputs/outputs and no dependencies, so we can
		// write a smoke test with no mocks at all
		
		ComputeEngine engine = new ComputeEngineImpl();
		Assert.assertEquals("1", engine.compute(1));
	}
}
