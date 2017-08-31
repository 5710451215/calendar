package test;

import static org.junit.Assert.*;

import crontroller.CrontrollerSystem;

public class Test {

	@org.junit.Test
	public void test() {
		CrontrollerSystem c1 = new CrontrollerSystem();
	       c1.startApplication();
	}

}
