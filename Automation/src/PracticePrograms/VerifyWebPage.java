package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		String actualurl= driver.getCurrentUrl();
		String expectedTitle= "Facebook – log in or sign up";
		String expectedUrl = "https://www.facebook.com/";

		if(actualTitle.contentEquals(expectedTitle) || actualurl.contains(expectedUrl)) {
			System.out.println("Pass: Login page is displayed");
		}
		else
		{
			System.out.println("Fail: Login page is not displayed");
		}

		driver.quit();
	}

}
