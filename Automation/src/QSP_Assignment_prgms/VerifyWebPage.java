package QSP_Assignment_prgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumhq.org");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = ("https://www.selenium.dev/");
		if (actualUrl.equals(expectedUrl))
		{
			System.out.println("Pass:Url is navigating");
		}
		else
		{
			System.out.println("Fail:Url is not navigating");
		}
		driver.quit();
	}

}
