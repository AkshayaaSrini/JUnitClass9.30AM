package jUnitThirddayClass;

import org.junit.Ignore;
import org.junit.Test;

public class C {
	
	@Test
	public void tc111() {
		System.out.println("Test 111");

	}
	
	@Test
	public void tc222() {
		System.out.println("Test 222");

	}
	
	@Ignore
	@Test
	public void tc333() {
		System.out.println("Test 333");
		

	}

}
