package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class  CommonAPI {
    public WebDriver driver;


    @BeforeMethod

    public void setUp () {
        System.setProperty ( "webdriver.chrome.driver",
                "C:\\Users\\Shumson Nahar\\IdeaProjects\\Dec2021-web-automation-framework-team4\\Generic\\src\\drivers\\chromedriver.exe" );
        driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 10,TimeUnit.SECONDS );
        driver.manage ().window ().maximize ();
        driver.get ( "https://www.Alibaba.com/" );

    }


    @AfterMethod
    public void afterMethod () {
        driver.quit ();

    }

    public void click (String locator) {
        try {
            driver.findElement ( By.xpath ( locator ) ).click ();
        } catch (Exception e) {
            driver.findElement ( By.cssSelector ( locator ) ).click ();
        }
    }
    public void type(String locator,String text){
        driver.findElement ( By.id(locator) ).sendKeys ( text );


        }
    }










