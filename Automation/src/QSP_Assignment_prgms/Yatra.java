package QSP_Assignment_prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://flight.yatra.com/");
		List<WebElement> allFli = driver.findElements(By.xpath("//span[@class='i-b bold'])/../../../../../div[3]/div[2]/div[2]/div/div[1]/div/div[1]/p[2])[1]"));
		//for(WebElement e:allFli) {
			int count = allFli.size();
			System.out.println(count);
		//}
	}

}
