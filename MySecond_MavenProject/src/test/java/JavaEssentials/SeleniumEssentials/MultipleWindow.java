package JavaEssentials.SeleniumEssentials;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;


public class MultipleWindow {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapas\\IdeaProjects\\Drivers\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement playStore = driver.findElement(By.xpath("//span[contains(text(),'Google Play Store')]"));
        playStore.click();
        // hold all window handles in array list
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + driver.getTitle());
        driver.switchTo().window(newTb.get(0));
        System.out.println("Page title of parent tab: " + driver.getTitle());
    }

}
