package QSP_Assignment_prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GovWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://pib.gov.in/");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(WebElement li:allLinks) {
			String links = li.getText();
			System.out.println(links);
		}
		driver.quit();
	}

}
