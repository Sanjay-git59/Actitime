package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("Alert")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']]")).click();
		
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		 String text = driver.switchTo().alert().getText();
		 driver.switchTo().alert().dismiss();
		 System.out.println(text);
		
		
	}

}
