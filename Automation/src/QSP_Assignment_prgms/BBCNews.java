package QSP_Assignment_prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allSugg = driver.findElements(By.xpath("//h2[text()='Must watch']/../../../../../div[2]/div/div/div/div/a/div[1]/div[2]/div[1]/div/h2"));
		int count = allSugg.size();
		System.out.println(count);
		for(WebElement e:allSugg)
		{
			String text = e.getText();
			System.out.println(text);
		}
	}

}
