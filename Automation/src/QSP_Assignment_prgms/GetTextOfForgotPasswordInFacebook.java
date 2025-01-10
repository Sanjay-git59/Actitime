package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfForgotPasswordInFacebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement text = driver.findElement(By.xpath("//div[@id='login_link']/a[1]"));
		String tagname = text.getTagName();
		String attribute = text.getAttribute("href"); 
		System.out.println(tagname);
		System.out.println(attribute);
		driver.quit();
	}

}
