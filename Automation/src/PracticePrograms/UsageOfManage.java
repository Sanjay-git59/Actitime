package PracticePrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		driver.manage().window().setSize(new Dimension(870, 600));
		driver.manage().window().setPosition(new Point(100, 60));
		driver.manage().window().minimize();
		driver.quit();

	

	}

}
