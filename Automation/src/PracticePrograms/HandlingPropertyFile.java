package PracticePrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\Preethi B Y\\OneDrive\\Desktop\\commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.quit();
		
	}

}
