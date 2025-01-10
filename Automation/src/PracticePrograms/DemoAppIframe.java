package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppIframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		driver.findElement(By.linkText("Nested iframe")).click();
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]"));
		String e=email.getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(e);

}
}
