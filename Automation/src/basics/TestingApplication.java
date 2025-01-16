package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingApplication {
	@Test
	public void print()
	{
		Reporter.log("Hi",true);
	}

}
