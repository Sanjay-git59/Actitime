package PracticePrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameAndAttribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement forgotBtn = driver.findElement(By.linkText("Forgotten password?"));
		String tagName = forgotBtn.getTagName();
		String attribute = forgotBtn.getAttribute("href");
		System.out.println("Tag name : " +tagName);
		System.out.println("Attribute of href : " +attribute);
		driver.quit();
		
	}

}
