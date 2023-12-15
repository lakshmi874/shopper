package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invoke {
	@Test(invocationCount = 3,priority = 1)
	public void test1()
	{
		Reporter.log("hello",true);
	}

@Test(invocationCount = 3,priority = 1)
public void test2()
{
	Reporter.log("india",true);
}
}