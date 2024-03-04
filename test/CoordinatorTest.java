

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import interfaces.ComputationCoordinator;
import interfaces.ComputeEngine;
import interfaces.ComputeRequest;
import interfaces.DataStore;
import interfaces.CoordinatorImpl;
import interfaces.ComputeResult;

public class CoordinatorTest {
    @Test
    public void smokeTest() {
        // mock out the dependencies so that we're just checking the ComputationCoordinator
        DataStore dataStore = Mockito.mock(DataStore.class);
        ComputeEngine computeEngine = Mockito.mock(ComputeEngine.class);

        ComputationCoordinator coord = new CoordinatorImpl(dataStore, computeEngine);

        ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
        ComputeResult result = coord.compute(mockRequest);

        Assert.assertEquals(result.getStatus(), ComputeResult.Status.SUCCESS);
    }
}
