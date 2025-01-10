package QSP_Assignment_prgms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollDemoApps {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.linkText("NRI")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		WebElement target = driver.findElement(By.xpath("(//span[text()='PAY'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		
	}

}
//(//section[text()='Scroll'])[1]