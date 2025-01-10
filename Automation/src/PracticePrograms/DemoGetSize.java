package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginBtn = driver.findElement(By.name("login"));
		int height=loginBtn.getSize().getHeight();
		int width=loginBtn.getSize().getWidth();
		System.out.println("Height : " +height);
		System.out.println("width : " +width);
		driver.quit();

	}

}
