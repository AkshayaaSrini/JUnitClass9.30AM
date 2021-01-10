package jUnitThirddayClass;

import org.junit.Test;

import junit.framework.Assert;

public class A {
	
	@Test
	public void tc1() {
		System.out.println("Test 1");

	}
	
	@Test
	public void tc2() {
		Assert.assertEquals("failture in tc2", "abc", "abc");
		System.out.println("Test 2");

	}

}
