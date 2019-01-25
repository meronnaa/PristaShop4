package com.prestashop.tests.functional_tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {


//very useful method
    @Test
    public void logIN() {
        String browser = ConfigurationReader.getProperty("browser");
        driver.get(ConfigurationReader.getProperty("url2"));

        //3.Verify title equals “Web Orders Login”
        Assert.assertEquals(driver.getTitle(), "Web Orders Login");

    }
    @Test
        public void positivLoginTest(){
        //4.Enter username “Tester”
        homepage.username1.sendKeys(ConfigurationReader.getProperty("username1"));
        //5.Enter password “test”
        homepage.password1.sendKeys(ConfigurationReader.getProperty("password1"));
       //6.Click on Login button
        homepage.login1.click();
        //7.Verify title equals “Web Orders”
        Assert.assertEquals(driver.getTitle(),"Web Orders");
        //8.Verify url equals http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Assert.assertNotEquals(driver.getCurrentUrl(),"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }


    //WO-2: Negative Login TestWrong Username
    @Test
    public void negLoginWUser(){
        logIN();
        //3.Verify title equals “Web Orders Login”
        Assert.assertEquals(driver.getTitle(),"Web Orders Login");
        //4.Save the current url
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        //5.Enter username “Test”
        homepage.username1.sendKeys(ConfigurationReader.getProperty("usernameNega"));
        //6.Enter password “Test”
        homepage.password1.sendKeys(ConfigurationReader.getProperty("password1"));
        //7.Click on Login button
        homepage.login1.click();
        //8.Verify title still equals “Web OrdersLogin”
        Assert.assertNotEquals(driver.getTitle(),"Web OrdersLogin");
        //9.Verifythe currenturl equals the string saved in step 4
        Assert.assertEquals(currentUrl,driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }


    //WO-3: Negative Login TestWrong Password
    @Test
    public void negLoginWPass(){
        logIN();
        //3.Verify title equals “Web Orders Login”
        Assert.assertEquals(driver.getTitle(),"Web Orders Login");
        //4.Save the current url
        String currentUrl=driver.getCurrentUrl();

        //5.Enter username “Tester”
        homepage.username1.sendKeys(ConfigurationReader.getProperty("username1"));
        //6.Enter password “Tester”
        homepage.password1.sendKeys(ConfigurationReader.getProperty("passwordNega"));
        //7.Click on Login button
        homepage.login1.click();
        //8.Verify title still equals “Web Orders Login”
        Assert.assertNotEquals(driver.getTitle(),"Web Orders Login");
        //9.Verify the current url equals the string saved in step 4
        Assert.assertNotEquals(currentUrl,driver.getCurrentUrl());


    }
   
       


    










}
