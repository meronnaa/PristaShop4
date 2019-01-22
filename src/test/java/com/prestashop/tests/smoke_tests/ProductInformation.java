package com.prestashop.tests.smoke_tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductInformation extends TestBase {
 //   Homepage homepage=new Homepage();     ==> put this in your setUp method in TestBase;
    @Test
  public void loginpdt() {
        String browser = ConfigurationReader.getProperty("browser");
        driver.get(ConfigurationReader.getProperty("url"));
        homepage.login.click();
        homepage.emailaddress.sendKeys(ConfigurationReader.getProperty("username"));
        homepage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homepage.signin.click();
        System.out.println(homepage.myAccount.getText());
        Assert.assertTrue(homepage.myAccount.getAttribute("innerText").contains("My account"));

        //6.Click on My personal informationbutton
        homepage.mypersonalInfo.click();

        // 7.Verify title contains Identity
        Assert.assertTrue(driver.getTitle().trim().contains("Identity"));

        //8.Verify thatfirst name and last name matches the full name on top
        String firstAndLast = homepage.firstname.getAttribute("value").trim() + " " + homepage.lastName.getAttribute("value").trim();
        Assert.assertEquals(firstAndLast, homepage.nameOnTop.getAttribute("innerText").trim());

        //9.Click on Save button
        homepage.saveButton.click();
        //10.Verify error message “The password you entered is incorrect.”
        Assert.assertEquals(homepage.errorMessage.getAttribute("innerText"), "The password you entered is incorrect.");

        //11.Click onBack to your account
        homepage.backToAccount.click();
        //12.Verify that title contains My account
        Assert.assertTrue(homepage.myAccount.getAttribute("innerText").contains("My account"));

        //Login: My addresses13.Clickon My addresses
        homepage.myaddress.click();

        //14.Clickon Adda new address
        homepage.addNewAddres.click();

       // 15.Verify thatfirst name and last name matches the full name on top
        String firstAndLast1 = homepage.firstname.getAttribute("value").trim() + " " + homepage.lastName.getAttribute("value").trim();
        Assert.assertEquals(firstAndLast1, homepage.nameOnTop.getAttribute("innerText").trim());

       //16.Delete the first name
        homepage.firstname.clear();

        //17.Click save
        homepage.clkSave.click();

        //18.Verify error message “firstname is required.”
        System.out.println(homepage.errMessage.getText());
        Assert.assertEquals(homepage.errMessage.getText(),"firstname is required.");






















    }
}
