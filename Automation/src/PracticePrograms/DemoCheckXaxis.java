package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckXaxis {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		int x1= driver.findElement(By.id("username")).getLocation().getX();
		int x2= driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2)
		{
			System.out.println("User name and password text box are properly aligned and Pass");
		}
		else
		{
			System.out.println("User name and password text box are not properly aligned and Fail");
		}
		driver.quit();
	}

}
