package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs" + Keys.ENTER);
		Thread.sleep(3000);
		 List<WebElement> allLink = driver.findElements(By.tagName("a"));
		 for(WebElement link : allLink)
		 {
			 System.out.println(link.getText()	);
		 }
		
		driver.quit();
		
	}
}
