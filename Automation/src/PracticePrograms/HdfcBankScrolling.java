package PracticePrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HdfcBankScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(loginBtn).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		Set<String> allTabs = driver.getWindowHandles();
		for( String newTab:allTabs)
		{
			driver.switchTo().window(newTab);
		}
		driver.switchTo().frame(0);
		 WebElement knowMore = driver.findElement(By.partialLinkText("Know "));
		knowMore.click();
		Set<String> newTab = driver.getWindowHandles();
		for( String tab:newTab)
		{
			driver.switchTo().window(tab);
		}
		List<WebElement> allLang = driver.findElements(By.xpath("//p[contains(text(),'Download the Secure Banking')]"));
		List<String> langText=new ArrayList();
		for(WebElement lang:allLang)
		{
			langText.add(lang.getText());
		}
		ListIterator<String> li=langText.listIterator();
		while(li.hasNext())
		{
			li.next();
		
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		driver.quit();
		
	}

}
