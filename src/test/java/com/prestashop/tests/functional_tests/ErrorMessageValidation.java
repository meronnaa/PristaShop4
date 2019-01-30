package com.prestashop.tests.functional_tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidation extends TestBase {

    @Test
    public void messageValidation() {
        String browser = ConfigurationReader.getProperty("browser");
        driver.get(ConfigurationReader.getProperty("url"));
        homepage.signIn.click();

        //4.Enter newvalidemail to the email field
        homepage.newEmail.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        //5.Click on Create Account
        homepage.lastname.sendKeys(faker.name().lastName());
        homepage.passWrd.sendKeys(faker.internet().password());
        homepage.addresss.sendKeys(faker.address().streetAddress());
        homepage.city.sendKeys(faker.address().city());
        homepage.state.sendKeys(faker.address().state());
        String zipCode = faker.address().zipCode();
        String zipCod = zipCode.substring(0, 5);
        homepage.zipCode.sendKeys(zipCod);
        homepage.phoneNum.sendKeys(faker.phoneNumber().cellPhone());
        homepage.registerButton.click();

        //8.Verify that error message first name is required.is displayed
        Assert.assertEquals(homepage.firstNameRequiredErrorMege.getText().trim(), "firstname is required.");
    }
        @Test
      //  Cart Details
        public void cartTest()throws  InterruptedException{
        homepage.open();
        //3.Click on any productthat is not onsale
            homepage.clkPdt.click();
         driver.switchTo().frame(homepage.iFram);
            //4.Enter a random quantity between 2and 5
            //5.Select a different size
            String mer=homepage.selectingSize.getAttribute("value");
            Select select=new Select(homepage.selectingSize);
            int k=random.nextInt(4);
            switch (k){
                case 1:
                    homepage.addIcon.click();
                    select.selectByIndex(0);
                    break;
                case 2:
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    select.selectByIndex(1);
                    select.selectByIndex(2);

                    break;
                case 3:
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    select.selectByIndex(2);
                    break;
                case 4:
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    homepage.addIcon.click();
                    break;
            }

        //6.Click on add to cart
          homepage.addpdt.click();
            //7.Verifyconfirmation message Product successfully added to your shopping cart
           Assert.assertEquals( homepage.succesMessage.getText(),"Product successfully added to your shopping cart");
           //8.Dismiss the confirmation window by clicking on the x icon
            Thread.sleep(1000);
            homepage.xbutton.click();
            //9.Click on the company logo
            homepage.companyLogo.click();

          //  10.Click on any productthat is onsale
           Thread.sleep(2000);
            homepage.pdtOnSale.click();

            //11.Enter a random quantity between 2and 5
            //12.Select a different size
            Thread.sleep(2000);
       driver.switchTo().frame(homepage.ifram2);

            int l=random.nextInt(4);
            switch (l){
                case 1:
                    homepage.addIcon2.click();
                    select.selectByIndex(0);
                    break;
                case 2:
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    select.selectByIndex(1);
                    select.selectByIndex(2);

                    break;
                case 3:
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    select.selectByIndex(2);
                    break;
                case 4:
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    homepage.addIcon2.click();
                    break;
            }

         //13.Click on add to cart

            actions.moveToElement(homepage.addPdt2).doubleClick(homepage.addPdt2).perform();
            //cart14.Verifyconfirmation message Product successfully added to your shopping cart
            Thread.sleep(1000);
          Assert.assertEquals(  homepage.succesMessage.getText(),"Product successfully added to your shopping cart");
          //15.Dismiss the confirmation window by clicking on the x icon
            homepage.xbutton.click();
            //16.Hover over the Cart icon
          actions.moveToElement(  homepage.hoverOverCart1).clickAndHold().perform();
          //17.Verify that correct total is displayed

            String pTotal=homepage.totalPrice.getAttribute("innerText").replace("$","");//i can use substring(1)
            Double ppTotal=Double.parseDouble(pTotal);

            System.out.println(ppTotal);

            String price1=homepage.pricePdt1.getAttribute("innerText").replace("$","");
            Double pricep1=Double.parseDouble(price1);

            String price2=homepage.pricePdt2.getAttribute("innerText").replace("$","");
            Double pricep2=Double.parseDouble(price2);

            String shipPrice=homepage.shippingPrice.getAttribute("innerText").replace("$","");
            Double shippingPric=Double.parseDouble(shipPrice);



            Assert.assertEquals(ppTotal,(pricep1+pricep2+shippingPric));

            //18.Verify that total is correct based on the price and item count of the products you added to cart. (Shipping is always $2)










































}
}
