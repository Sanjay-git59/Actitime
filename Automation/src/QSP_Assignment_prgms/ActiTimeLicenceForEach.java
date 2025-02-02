package QSP_Assignment_prgms;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLicenceForEach {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		Set<String> wh = driver.getWindowHandles();
		for(String w:wh)
		{
			driver.switchTo().window(w);
		}
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		for(WebElement h2:headings) {
			String text = h2.getText();
			System.out.println(text);
		}
		Set<String> wh1 = driver.getWindowHandles();
		for( String w:wh1) {
		driver.switchTo().window(w);
		driver.close();
		}
	}

}
