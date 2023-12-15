package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled = false)
	public void test1()
	{
		Reporter.log("hello",true);
	}

	@Test
	public void test2()
	{
		Reporter.log("India",true);
	}

}
