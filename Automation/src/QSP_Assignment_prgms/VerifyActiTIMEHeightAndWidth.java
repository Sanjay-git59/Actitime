package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActiTIMEHeightAndWidth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/sselenium/login.do");
		int height1 = driver.findElement(By.id("username")).getSize().getHeight();
		int height2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int width1 = driver.findElement(By.id("username")).getSize().getWidth();
		int width2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if(height1==height2 && width1==width2) {
			System.out.println("Username and Password fields are aligned properly");
		}
		else
		{
			System.out.println("Username and Password fields are not aligned properly");
		}
		driver.quit();
	}
}
