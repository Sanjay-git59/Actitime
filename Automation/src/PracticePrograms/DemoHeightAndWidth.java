package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHeightAndWidth {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		int height1= userName.getSize().getHeight();
		int width1= userName.getSize().getWidth();
		WebElement password = driver.findElement(By.name("pwd"));
		int height2= password.getSize().getHeight();
		int width2= password.getSize().getWidth();
		System.out.println("Height of user name field = " +height1);
		System.out.println("Height of password field = " +height2);
		System.out.println("Width of user name field = " +width1);
		System.out.println("Height of password field = " +width2);
		if(height1==height2 && width1==width2)
		{
			System.out.println("Height and Width are equal");
		}
		else
		{
			System.out.println("Height and Width are not equal");
		}
			
		driver.quit();
		
	}

}

