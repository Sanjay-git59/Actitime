package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		boolean text = driver.findElement(By.id("demo")).isDisplayed();
		if(text=true)
		{
			System.out.println("You Pressed cancel is Displayed");
		}
		else
		{
			System.out.println("You Pressed cancel is not Displayed");
		}
	}

}
