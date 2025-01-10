package QSP_Assignment_prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActiTimeCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/sselenium/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(checkbox==true)
		{
			System.out.println("Keep me logged in checkbox is Checked");
		}
		else
		{
			System.out.println("Keep me logged in checkbox is not Checked");
		}
		driver.quit();
	}

}
