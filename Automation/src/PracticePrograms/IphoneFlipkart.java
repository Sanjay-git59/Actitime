package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneFlipkart {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone" +Keys.ENTER);
		List<WebElement> name = driver.findElements(By.xpath("(//div[contains(text(),'Apple iPhone')])"));
		List<WebElement> price = driver.findElements(By.xpath("(//div[contains(text(),'Apple iPhone')])/../../div[2]/div[1]/div[1]/div[1]"));
		int count=price.size();
		for(int i=0;i<=count;i++) {
			System.out.println(name+"==>"+price);
		}
	}

}

