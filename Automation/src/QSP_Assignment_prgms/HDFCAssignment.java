package QSP_Assignment_prgms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HDFCAssignment {

    public static void main(String[] args) throws InterruptedException {
        // Disable notifications in Chrome
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate to HDFC Bank's website
        driver.get("https://www.hdfcbank.com/");
        Thread.sleep(3000);

        // Locate and interact with the Login button
        WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).perform();
        driver.findElement(By.linkText("NetBanking")).click();

        // Handle multiple browser tabs/windows
        Set<String> allTabs = driver.getWindowHandles();
        for (String tab : allTabs) {
            driver.switchTo().window(tab);
        }

        // Switch to the first frame on the new page
        driver.switchTo().frame(0);

        // Click the "Know More" link
        WebElement knowMore = driver.findElement(By.partialLinkText("Know"));
        knowMore.click();

        // Handle new browser windows opened after clicking "Know More"
        Set<String> newTabs = driver.getWindowHandles();
        for (String newTab : newTabs) {
            driver.switchTo().window(newTab);
        }

        // Find all links for downloading the secure app in different languages
        List<WebElement> allLang = driver.findElements(By.xpath("//p[contains(text(),'Download the Secure')]/a"));

        // Store the text of all download links in a list
        List<String> langTexts = new ArrayList<>();
        for (WebElement lang : allLang) {
            langTexts.add(lang.getText());
        }

        // Iterate over the list using a ListIterator
        ListIterator<String> li = langTexts.listIterator();
        while (li.hasNext()) {
           li.next();
        }

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Quit the driver
        driver.quit();
    }
}
