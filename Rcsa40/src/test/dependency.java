package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependency {
@Test
public void compose()
	{
		Reporter.log("compose",true);
	}
	@Test(dependsOnMethods = "compose")
	public void sentItems()
	{
		Reporter.log("sentitems",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "sentitems")
	public void trash()
	{
		Reporter.log("trash",true);
	}

}

