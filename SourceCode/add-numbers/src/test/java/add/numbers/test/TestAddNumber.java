package add.numbers.test;

import java.util.Scanner;

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
		Assert.assertEquals(3111, result);

	}
	
	@Test
	public void testUnknownAmountOfNumbers() {
		// 2 Testcase
		Operation op = new Operation();
		int result = op.Add("1000,2111,1,2,2500");
		Assert.assertEquals(5614, result);

	}
	
	@Test
	public void testWithDifferentDelimeters() {
		// 3 Testcase
		Operation op = new Operation();
		int result = op.Add("//;\n599;132");
		//System.out.println(sc.delimiter());
		Assert.assertEquals(731, result);	
	}
	
	@Test
	public void testNumbersInNewLine() {
		// 4 TestCase
		Operation op = new Operation();
		int result = op.Add("1\n599,132");
		//System.out.println(sc.delimiter());
		Assert.assertEquals(732, result);
	}
	
	@Test
	public void AdditionalTest1() {
		// 4.1 TestCase WithNumbersInNewLine
		Operation op = new Operation();
		int result = op.Add("1\n599,132\n54\n85\n78,9333");
		//System.out.println(sc.delimiter());
		Assert.assertEquals(10282, result);
	}
	
	@Test
	public void AdditionalTest2() {
		// 4.2 TestCase With NumbersInNewLine + DifferentDelimeter
		Operation op = new Operation();
		int result = op.Add("//-\n2\n599-132\n54\n85\n78-9333");
		//System.out.println(sc.delimiter());
		Assert.assertEquals(10283, result);
	}

}
