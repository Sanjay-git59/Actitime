package QSP_Assignment_prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement link = driver.findElement(By.id("APjFqb"));
		link.sendKeys("Wipro Jobs");
		link.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		for(WebElement ele:allUrls) {
	     System.out.println(ele.getAttribute("href"));
		}
	}

}
