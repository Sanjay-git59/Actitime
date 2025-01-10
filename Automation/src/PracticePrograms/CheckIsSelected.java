package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelected {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		boolean checkBox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(checkBox==true)
		{
			System.out.println("checkBox is selected and Pass");
		}
		else
		{
			System.out.println("checkBox is not selected and Fail");
		}
		driver.quit();

	}

}
