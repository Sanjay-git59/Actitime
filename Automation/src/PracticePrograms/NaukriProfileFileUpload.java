package PracticePrograms;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriProfileFileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("preethiby@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Preethi@2000");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']//a")).click();
		File f=new File("‪C:\\Preethi B Y -Resume. (1).pdf");
		String absolutePath=f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@value='Update resume']")).sendKeys(absolutePath);
		Thread.sleep(2000);
		driver.quit();
	}

}
