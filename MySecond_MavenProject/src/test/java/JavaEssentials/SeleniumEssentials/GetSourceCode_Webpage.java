package JavaEssentials.SeleniumEssentials;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;

public class GetSourceCode_Webpage {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapas\\IdeaProjects\\Drivers\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        // wait for sometime
        Thread.sleep(4*1000);
        // get source code
        String src_code = driver.getPageSource(); // this method will fetch the source code
        // print source code
        System.out.println("*********************************");
        System.out.println(src_code);
        System.out.println("***********************************");
        // wait for sometime
        Thread.sleep(3000);
        //quit the browser
        driver.quit();
    }

}
