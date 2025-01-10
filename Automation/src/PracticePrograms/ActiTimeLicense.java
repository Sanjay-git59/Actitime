package PracticePrograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLicense {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		Set<String> wh = driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for( String tab:wh)
		{
			driver.switchTo().window(tab);
		}
		  List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		  for(WebElement allHeadings:headings)
		  {
			  System.out.println(allHeadings.getText());
		  }
		  driver.quit();
		  
	}
	

}
