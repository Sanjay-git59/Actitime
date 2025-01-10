package QSP_Assignment_prgms;

import org.openqa.selenium.WebDriver;

public class DemoA {
static void TestA(WebDriver driver)
{
	String title = driver.getTitle();
	System.out.println(title);
	driver.quit();
}
}

