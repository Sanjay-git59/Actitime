package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(y1==y2&& y1==y3)
		{
			System.out.println("All Gender Section alligned properly");
		}
		else
		{
			System.out.println("All Gender Section not alligned properly");
		}
		driver.quit();
	}

}
