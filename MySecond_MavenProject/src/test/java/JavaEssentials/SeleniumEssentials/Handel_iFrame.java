package JavaEssentials.SeleniumEssentials;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Handel_iFrame {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapas\\IdeaProjects\\Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement f=driver.findElement(By.xpath("//*[@id='iframeResult']"));
        driver.switchTo().frame(f);

        WebElement drag = driver.findElement(By.xpath("//*[@id='drag1']"));
        WebElement drop = driver.findElement(By.xpath("//*[@id='div1']"));

        Actions builder = new Actions(driver);
        Actions dragAndDrop = builder.clickAndHold(drag);
        builder.moveToElement(drop);
        builder.release(drop);
        builder.build();
        dragAndDrop.perform();
    }
}
