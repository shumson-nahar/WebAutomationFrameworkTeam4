package us.piit;
import base.CommonAPI;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AppTest extends CommonAPI {

    @Test
    public void test1 () throws InterruptedException {
        String expectedTitle = "Alibaba.Spend less. Smile more.";
        String actualTitle = driver.getTitle ();
        // Assert.assertEquals( actualTitle,expectedTitle,"title validation success" );
        type("//*[@id=\"header2012\"]/div[2]/div/div[7]/div/form/div[1]/div/div/span[1]","product");
        click("#nav-search-submit-button");
    }

    @Test
    public void test5 () {
        driver.findElement ( By.xpath ( "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[1]/div/div/span[1]" ) ).click ();


    }

    @Test
    public void test2 () {
        driver.findElement ( By.xpath ( "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[1]/div/div/span[1]" ) ).click ();

    }

    @Test
    public void test3 () {
        driver.findElement ( By.xpath ( "/html/body/div[4]/div[3]/div[1]/div[2]/div/div[1]/div[3]/a[1]/div/div/span[2]" ) ).click ();

    }

    @Test
    public void test10 () throws InterruptedException {
        driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "java book" );
        driver.findElement ( By.id ( "nav-search-submit-button" ) ).click ();

    }

    @Test
    public void test4 () {
        driver.findElement ( By.xpath ( " //span[contains(text(),'Products')]" ) ).sendKeys ( "product" );
        driver.findElement ( By.xpath ( "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/i[1]" ) ).click ();
    }
}