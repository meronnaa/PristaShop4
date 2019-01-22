package com.prestashop.tests.smoke_tests;

import Utilities.ConfigurationReader;
import Utilities.TestBase;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pdtInfo_Price extends TestBase {

    @Test
    public void priceTest(){
        String browser = ConfigurationReader.getProperty("browser");
        driver.get(ConfigurationReader.getProperty("url"));
        String productBeforeClick = homepage.prdName.getAttribute("innerText").trim();
        String itempriceBef=homepage.itemPricebefore.getAttribute("value");
         homepage.clkPdt.click();
        //3.Verify that same name and price displayed as on the home page

        driver.switchTo().frame(homepage.iFram);
        Assert.assertEquals(itempriceBef,homepage.itempriceAfter.getAttribute("value"));
        Assert.assertEquals(productBeforeClick,homepage.prdName1.getAttribute("title"));
       //4.that default quantity is 1
        Assert.assertEquals(homepage.defaultQuantity.getAttribute("value"),"1");
       //5.Verify that defaultsize is S
        Assert.assertEquals(homepage.defaultSize.getAttribute("innerText"),"S");
       // 6.Verify that size options are S, M, L
        String size1=homepage.sizes.getAttribute("values");





        //Product information–Add to cart:7.Click on Add to cart
        homepage.addpdt.click();
       //8.Verify confirmation message “Product successfully added to your shopping cart”
        Assert.assertTrue(homepage.sucessMessage.getAttribute("innerText").contains("Product successfully added to your shopping cart"));

        //9.that default quantity is1
        Assert.assertEquals(homepage.quantiyDefault.getAttribute("innerText"),"1");

        //10.Verify that defaultsize is S
        Assert.assertTrue(homepage.sizeDefault.getAttribute("innerText").contains("S"));//************need further gidance


        //11.Verify that same name and price displayed as on the home page











    }


}
