package PracticePrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement dClick = driver.findElement(By.id("loginspan"));
		Actions a=new Actions(driver);
		a.doubleClick(dClick).perform();
		String expectedUrl = "Login - Vtiger";
		String actualUrl = driver.getTitle();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Login page is displayed");
		}
		else
		{
			System.out.println("Login page is not displayed");
		}
		driver.quit();
		
		
	}

}
