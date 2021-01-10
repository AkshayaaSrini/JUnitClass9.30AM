package jUnitThirddayClass;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner {
	
	@Test
	public void tc1() {
		
		Result rs = JUnitCore.runClasses(B.class, A.class, C.class);
		
		System.out.println(rs.getRunTime());
		
		System.out.println(rs.getRunCount());
		
		System.out.println(rs.getIgnoreCount());
		
		System.out.println(rs.getFailureCount());
		
	}

}
