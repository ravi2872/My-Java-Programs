package mockito;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

@PrepareForTest(Truck.class)
public class TruckTest extends PowerMockTestCase {
	private static final double TESTING_LOAD_WEIGHT = 200;
	private static final double TESTING_BOX_WEIGHT = 100;

	@Test
	public void testTestingMethod() throws Exception {
		// Truck truck = new Truck();
		Truck truckSpy = PowerMockito.mock(Truck.class);
		PowerMockito.doReturn(TESTING_LOAD_WEIGHT).when(truckSpy, "getLoadWeight");
		PowerMockito.doNothing().when(truckSpy, "addBoxToLoad", TESTING_BOX_WEIGHT);
		// call testing method
		Collection<Double> boxesWeights = Arrays.asList(TESTING_BOX_WEIGHT, TESTING_BOX_WEIGHT);
		double actualLoad = truckSpy.addLoad(boxesWeights);
		Assert.assertEquals(actualLoad, TESTING_LOAD_WEIGHT);
		PowerMockito.verifyPrivate(truckSpy, Mockito.times(2)).invoke("addBoxToLoad", TESTING_BOX_WEIGHT);
	}
}
