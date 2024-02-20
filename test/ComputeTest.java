import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ComputeTest {

	@Test
	public void smokeTestCompute() {
		// The computation component has very simple inputs/outputs and no dependencies, so we can
		// write a smoke test with no mocks at all
		
		ComputeEngine engine = new ComputeEngineImpl();
		Assert.assertEquals("1", engine.compute(1));
	}
}
