package com.prestashop.tests.functional_tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.TestBase;
import com.github.javafaker.Faker;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RegistrationTest extends TestBase {


    @Test
    public void registrationTest(){
        String browser=ConfigurationReader.getProperty("browser");
        driver.get(ConfigurationReader.getProperty("url"));
        homepage.signIn.click();

        String emailAddress = faker.internet().emailAddress();
        homepage.newEmail.sendKeys(emailAddress + Keys.ENTER);
        Assert.assertEquals(homepage.neEmail.getText(),homepage.newEmail.getText());
        String emailme=homepage.newEmail.getAttribute("value");
        String email=homepage.newEmail.getText();//i need these for number 11 i don't really know why it fails with getattribut...

        //7.Fill out all the required steps
        String firstName = faker.name().firstName();
        homepage.firstName.sendKeys(firstName);
        String name1=  homepage.firstName.getText();

        String lastName = faker.name().lastName();
        homepage.lastname.sendKeys(lastName);
        String last2= homepage.lastname.getText();

        String firstAndLastName=firstName + " "+lastName;
        String password = faker.internet().password();
        homepage.passWrd.sendKeys(password);
       String pass= homepage.passWrd.getAttribute("value");
        System.out.println(pass);

        String streetAddress = faker.address().streetAddress();
        homepage.addresss.sendKeys(streetAddress);
        String street2= homepage.addresss.getAttribute("value");

        String city = faker.address().city();
        homepage.city.sendKeys(city);
        String cityy= homepage.city.getAttribute("value");

        //String state = faker.address().state();
        homepage.state.sendKeys("VA");
        String stat=homepage.state.getText();


        String zipCode = faker.address().zipCode();
        String zipCod=zipCode.substring(0,5);
        homepage.zipCode.sendKeys(zipCod);
        String zip=homepage.zipCode.getAttribute("value");

        String cellPhone = faker.phoneNumber().cellPhone();
        homepage.phoneNum.sendKeys(cellPhone);

        //8.Click on Register
        homepage.registerButton.click();

        //9.Verify that correct first and last name isdisplayedcorrectly on top right
        homepage.nameOnTopp.getAttribute("innerText");
        Assert.assertEquals(firstAndLastName,homepage.nameOnTopp.getAttribute("innerText").trim());

        //10.Click on My personal information
        homepage.clickOnpersonalInfo.click();

        //11.Verify that personal information is displayedcorrectly
        Assert.assertEquals(homepage.secFirName.getText(),name1);
       Assert.assertEquals(last2,homepage.secLastName.getText());
      Assert.assertEquals(email,homepage.emailConfiramtion.getText());

        //12.Clickon Back to your account
        homepage.backToaccouButton.click();
               //13.Click on My addresses verify that address information is displayed correctly
                    homepage.clickOnAddress.click();
                    String firstandLast=  homepage.addName.getText()+ " " +homepage.addlastName.getText();
                  Assert.assertEquals(firstandLast,firstAndLastName);
                  Assert.assertEquals(homepage.streetAdd.getText(),street2);//=====asserting street
                  String str=homepage.allAddress.getText();
                  System.out.println(homepage.allAddress.getText());
                  String cityy1=str.substring(0,str.indexOf(","));
                  Assert.assertEquals(cityy1,cityy);//=======asserting city
                  String statttt=str.substring(str.indexOf(',')+1,str.length()-5);
                  //str.substring(str.indexOf(',')+1).replaceAll("[0-9]","").trim();****i have issue with state
                  String zippp=str.replaceAll("\\D+","");
                  System.out.println(zippp);//======replacing all words with empty
                   Assert.assertEquals(zip,zippp);//==========asserting zip code


        //14.Click onsign outlink
        homepage.signOut.click();
       // 15.Login using the email and password if the current user
        homepage.loginUsingValidEmail.sendKeys(emailme);
        homepage.loginUsingValidPass.sendKeys(pass + Keys.ENTER);

        //16.Verify that correct first and last name isdisplayed correctly on top right
        Assert.assertEquals(homepage.nameOnTopp.getText(),firstandLast);








    }
}
