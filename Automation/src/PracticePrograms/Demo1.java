package PracticePrograms;

import org.openqa.selenium.WebDriver;


public class Demo1 {

	public static void testA(WebDriver driver)
	{
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();


	}

}
