package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opensourcebilling.org/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).clear();
	}

	}


