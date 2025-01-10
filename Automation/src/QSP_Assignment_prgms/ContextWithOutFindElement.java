package QSP_Assignment_prgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextWithOutFindElement {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Actions a = new Actions(driver);
	a.sendKeys("Java").perform();
	
	}

}
