package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]"));
		String email = e.getText();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.xpath("//p[text()='Default Password']/../p[4]"));
		String password = pwd.getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement cp = driver.findElement(By.xpath("//p[text()='Default Confirm Password']/../p[6]"));
		String cpwd = cp.getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("confirm-password")).sendKeys(cpwd);
		driver.findElement(By.id("submitButton")).click();
		driver.quit();
	}

}
