package PracticePrograms;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvOnlyDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		HashSet hs = new HashSet<>();
        driver.get("file:///C:/Users/Preethi%20B%20Y/OneDrive/Desktop/SLV.html");
        WebElement slvListBox = driver.findElement(By.id("slv"));
        Select s=new Select(slvListBox);
        List<WebElement> allOpt = s.getOptions();
        int count=allOpt.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
        	String text = allOpt.get(i).getText();
        	if(hs.add(text)==false) 
        	{
        		System.out.println(text);
        	}
        	
        }

        driver.quit();
	}

}
