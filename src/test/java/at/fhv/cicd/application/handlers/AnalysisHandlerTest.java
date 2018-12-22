package at.fhv.cicd.application.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.cicd.application.handlers.AnalysisHandler;

/**
 * Unit tests for {@link AnalysisHandler}
 * @author Michael Sieber
 *
 */
public class AnalysisHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(AnalysisHandler.getInstance());
	}
}
