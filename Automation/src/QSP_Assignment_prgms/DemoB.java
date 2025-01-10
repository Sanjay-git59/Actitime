package QSP_Assignment_prgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		DemoA.TestA(driver);
		Thread.sleep(2000);
		WebDriver driver1 = new FirefoxDriver();
		DemoA.TestA(driver1);
		Thread.sleep(2000);
		WebDriver driver2 = new EdgeDriver();
		DemoA.TestA(driver2);
		Thread.sleep(2000); 

	}

}
