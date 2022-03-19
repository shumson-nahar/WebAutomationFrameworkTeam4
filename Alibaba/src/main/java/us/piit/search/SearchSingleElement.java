package us.piit.search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSingleElement extends CommonAPI  {



    @Test
    public void test1() throws InterruptedException {
        String expectedTitle = "Alibaba.com,global product";
        String actualTitle =driver.getTitle();
       // Assert.assertEquals(actualTitle,expectedTitle,"title validation success");


    }

}
