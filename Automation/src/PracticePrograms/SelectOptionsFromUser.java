package PracticePrograms;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsFromUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select the item");
		String order=sc.next();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Preethi%20B%20Y/OneDrive/Desktop/SLV.html");
		
		 List<WebElement> item = driver.findElements(By.id("slv"));
		 
		if(item.contains(order))
		{
			System.err.println("Mentioned dish is present");
		}
		else
		{
			System.err.println("Mentioned dish is not present");
		}
		driver.close();
		
		
	}

}
