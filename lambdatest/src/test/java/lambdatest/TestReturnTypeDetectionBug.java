package lambdatest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lambdatest.dat.Model;

public class TestReturnTypeDetectionBug {

	@Test
	public void test() {
		ReturnTypeDetectionBug bug = new ReturnTypeDetectionBug();
		assertEquals(0, bug.createIdentifiers(new Model(), "none").size());
	}

}
