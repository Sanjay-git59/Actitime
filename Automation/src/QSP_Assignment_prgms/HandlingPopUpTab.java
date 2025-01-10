package QSP_Assignment_prgms;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUpTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.id("browserButton3")).click();
		Set<String> cwh = driver.getWindowHandles();
		for(String wh:cwh)
		{

			WebDriver cw = driver.switchTo().window(wh);
			try {
				
				boolean cp = driver.findElement(By.xpath("//h2[text()='Change Password']")).isDisplayed();
				if(cp==true)
				{
					driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
					driver.findElement(By.id("password")).sendKeys("manager123");
					driver.findElement(By.id("confirm-password")).sendKeys("manager123");
					driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
				}

			}
			catch(Exception e)
			{
			}
			
		}
	}
}
