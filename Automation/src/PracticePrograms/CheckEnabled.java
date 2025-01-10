package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean loginBtn = driver.findElement(By.name("login")).isEnabled();
		if(loginBtn==true)
		{
			System.out.println("Login button is enabled and Pass");
		}
		else
		{
			System.out.println("Login button is not enabled and Fail");
		}
		driver.quit();
	}

}
