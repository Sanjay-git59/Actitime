package QSP_Assignment_prgms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeifyWebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		String expectedTitle="Facebook";
		//String title = driver.getTitle();
		String expectedUrl = "https://www.facebook.com/";
		if(actualTitle.contains(expectedTitle)&&actualUrl.equals(expectedUrl)) {
			System.out.println("Pass: Login page is displayed");
		}
		else {
			System.out.println("Fail: Login page is not displayed");
		}
		driver.quit(); 
	}
}


