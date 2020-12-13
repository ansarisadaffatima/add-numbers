package add.numbers.test;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import add.numbers.Operation;
import junit.framework.Assert;

public class TestAddNumber {
	
	
	@Test
	public void testEmptyString() throws Exception {
		
		// 1.1 Testcase
		Operation op = new Operation();
		int result = op.Add("");
		Assert.assertEquals(0, result);

	}
	
	@Test
	public void testSingleNumber() throws Exception {
		// 1.2 Testcase	
		Operation op = new Operation();
		int result = op.Add("1");
		Assert.assertEquals(1, result);

	}
	
	@Test
	public void testfor2Numbers() throws Exception {
		// 1.3 Testcase
		Operation op = new Operation();
		int result = op.Add("1000,2111");
		Assert.assertEquals(3111, result);

	}
	
	@Test
	public void testUnknownAmountOfNumbers() throws Exception {
		// 2 Testcase
		Operation op = new Operation();
		int result = op.Add("1000,2111,1,2,2500");
		Assert.assertEquals(5614, result);

	}
	
	@Test
	public void testWithDifferentDelimeters() throws Exception {
		// 3 Testcase
		Operation op = new Operation();
		int result = op.Add("//;\n599;132");
		Assert.assertEquals(731, result);	
	}
	
	@Test
	public void testNumbersInNewLine() throws Exception {
		// 4 TestCase
		Operation op = new Operation();
		int result = op.Add("1\n599,132");
		Assert.assertEquals(732, result);
	}
	
	@Test
	public void AdditionalTest1() throws Exception {
		// 4.1 TestCase WithNumbersInNewLine
		Operation op = new Operation();
		int result = op.Add("1\n599,132\n54\n85\n78,9333");
		Assert.assertEquals(10282, result);
	}
	
	@Test
	public void AdditionalTest2() throws Exception {
		// 4.2 TestCase With NumbersInNewLine + DifferentDelimeter
		Operation op = new Operation();
		int result = op.Add("//-\n2\n599-132\n54\n85\n78-9333");
		Assert.assertEquals(10283, result);
	}
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testNegativeNumbers() throws Exception {
		// 5 TestCase
		exceptionRule.expect(Exception.class);
		exceptionRule.expectMessage("negatives not allowed(-1,-4,-8)");
		Operation op = new Operation();
		op.Add("-1,2\n-4,-8");
	}

}
