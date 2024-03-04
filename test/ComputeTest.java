

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import interfaces.ComputeEngine;
import interfaces.ComputeJobsImplementation;

public class ComputeTest {
    @Test
   public void smokeTestCompute() {
		
		ComputeEngine engine = new ComputeJobsImplementation();
		Assert.assertEquals("1", engine.compute(1));
	}
}
