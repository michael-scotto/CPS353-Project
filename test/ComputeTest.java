package test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import src.interfaces.ComputeEngine;
import src.interfaces.ComputeJobsImplementation;

public class ComputeTest {
    @Test
   public void smokeTestCompute() {
		
		ComputeEngine engine = new ComputeJobsImplementation();
		Assert.assertEquals("1", engine.compute(1));
	}
}
