package JavaEssentials;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.*;
import java.io.*;

import java.util.concurrent.TimeUnit;

public class HelloWorld {
    public  static  WebDriver driver;

        @BeforeTest    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tapas\\IdeaProjects\\Drivers\\chromedriver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.tickertape.in/");
        driver.manage().window().maximize(); // maximize the webpage
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logoTickerTap = driver.findElement(By.xpath("//div[contains(text(),'Guide your portfolio to the stars')]"));
        String a=logoTickerTap.getText();
        System.out.println(a);
        Assert.assertEquals(a,"Guide your portfolio to the stars" ,"Page Load Succesfull");
    }



    @Test
    public void searchScriptName()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchText = driver.findElement(By.cssSelector("input#search-stock-input"));
        searchText.sendKeys("IRFC");
        WebElement scriptName = driver.findElement(By.xpath("//*[contains(text(),'IRFC')]"));
        scriptName.click();
        WebElement appContainer = driver.findElement(By.xpath("//*[@id=\"app-container\"]"));
         int a =driver.findElements(By.className("jsx-3135203155")).size();
         System.out.println(a);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       /* String src_code = driver.getPageSource();
        System.out.println(src_code);*/
        WebElement ele = driver.findElement(By.xpath("((//span[contains(text(),'IRFC')])[2]/following::span)[8]"));
        String s= ele.getAttribute("innerHTML");
        System.out.println(s);
       /* WebElement intVal = driver.findElement(By.xpath("((//span[contains(text(),'Intrinsic Value')])[2]/following::p)[1]"));
        String x = intVal.getText();
        System.out.println(x);*/

        String filename = "myfile.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        try{
            String line;
            //as long as there are lines in the file, print them
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





/*
signInButton.click();
        WebElement acceptCookies = driver.findElement(By.cssSelector("[action-type=ACCEPT]"));
        acceptCookies.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginText = driver.findElement(By.cssSelector("input#username"));
        loginText.sendKeys("tapaswinee@hotmail.com");
        WebElement passwordText = driver.findElement(By.cssSelector("input#password"));
        passwordText.sendKeys("Linkedin@2020");
        WebElement signInButton1 = driver.findElement(By.cssSelector("button[type=submit]"));
        signInButton1.click();
        WebElement pPicture = driver.findElement(By.cssSelector("button#ember31"));
        pPicture.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement logOut = driver.findElement(By.xpath(""));
        driver.quit();
 */
