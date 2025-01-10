package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		String fontType= link.getCssValue("font-family");
		String fontSize= link.getCssValue("font-size");
		System.out.println(fontType);
		System.out.println(fontSize);
		driver.quit();
	}

}
