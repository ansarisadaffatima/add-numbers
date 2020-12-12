package add.numbers.test;

import org.junit.Test;

import add.numbers.Operation;
import junit.framework.Assert;

public class TestAddNumber {
	
	@Test
	public void testEmptyString() {
		
		// 1.1 Testcase
		Operation op = new Operation();
		int result = op.Add("");
		Assert.assertEquals(0, result);

	}
	
	@Test
	public void testSingleNumber() {
		// 1.2 Testcase	
		Operation op = new Operation();
		int result = op.Add("1");
		Assert.assertEquals(1, result);

	}
	
	@Test
	public void testfor2Numbers() {
		// 1.3 Testcase
		Operation op = new Operation();
		int result = op.Add("1000,2111");
		Assert.assertEquals(3, result);

	}

}
