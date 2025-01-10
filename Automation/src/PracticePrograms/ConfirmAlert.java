package PracticePrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(text);
		
		
		
		
	}

}
