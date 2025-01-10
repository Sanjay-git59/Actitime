package PracticePrograms;

import java.util.HashSet;
import java.util.List;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvAllOptionsWithoutDuplicate {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();

		WebDriver driver=new ChromeDriver();
		
		//HashSet hs1 = new HashSet<>();
        driver.get("file:///C:/Users/Preethi%20B%20Y/OneDrive/Desktop/SLV.html");
        WebElement slvListBox = driver.findElement(By.id("slv"));
        Select s=new Select(slvListBox);
        List<WebElement> allOpt = s.getOptions();
        int count=allOpt.size();
        for(int i=0;i<count;i++)
        {
        	String text = allOpt.get(i).getText();
        	hs.add(text);	
        }
	for(String text:hs)
      {
    	System.out.println(text);
      }
	driver.quit();
	}
}


