package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsWindowHandle {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//div[@title='Learn More']")).click();
		driver.findElement(By.xpath("//section[text()='X Path']")).click();
		
	}

}
