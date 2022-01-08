package JavaEssentials.SeleniumEssentials;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ExtractScriptName {
    public  static  WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tapas\\IdeaProjects\\Drivers\\chromedriver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.tickertape.in/");
        driver.manage().window().maximize(); // maximize the webpage
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logoTickerTap = driver.findElement(By.xpath("//div[contains(text(),'Guide your portfolio to the stars')]"));
        String a=logoTickerTap.getText();
        System.out.println(a);
        Assert.assertEquals(a,"Guide your portfolio to the stars" ,"Page LOad Succesfull");
    }



    @Test(dataProvider="scriptNameData")
    public void searchScriptName(String scriptName)
    {
       WebElement searchText= driver.findElement(By.cssSelector("input#search-stock-input"));
        searchText.sendKeys(scriptName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement scriptText = driver.findElement(By.xpath("//span[contains(text(),'Indian Railway Finance Corp Ltd')]"));
        scriptText.click();
    }

    @DataProvider(name="scriptNameData")
    public String[][] getData()
    {
     String scriptNames[][]={
             {"IRFC"}
     };
     return scriptNames;
    }

}

