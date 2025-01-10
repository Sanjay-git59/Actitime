package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YathraFlightNames {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.yatra.com/");
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	List<WebElement> flightElements = driver.findElements(By.xpath(""));
	

}
}
