package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s = new Select(month);
		s.selectByValue("5");
		//Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value='1994']")).click();
		driver.findElement(By.linkText("22")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(text=true)
		{
			System.out.println("Please Enter Valid Policy Number text is displayed");
		}
		else
		{
			System.out.println("Please Enter Valid Policy Number text is displayed");
	}
	}

}
