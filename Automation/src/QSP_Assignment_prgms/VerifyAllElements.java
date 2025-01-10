package QSP_Assignment_prgms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/table.html");
		List<WebElement> data = driver.findElements(By.xpath("//td"));
		int count = data.size();
		for(int i=0;i<count;i++) {
		String text = data.get(i).getText();
		System.out.println(text);
		}
		
	}

}
