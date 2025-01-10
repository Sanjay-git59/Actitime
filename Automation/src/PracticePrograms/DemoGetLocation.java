package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetLocation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();

		int radiobtn1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		Thread.sleep(2000);
		int radiobtn2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		Thread.sleep(2000);
		int radiobtn3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(radiobtn1==radiobtn2 && radiobtn1==radiobtn3)
		{
			System.out.println("Radio buttons are aligned properly");
		}
		else
		{
			System.out.println("Radio buttons are not aligned properly");
		}
		driver.quit();
	}

}
