package Utilities;

import com.github.javafaker.Faker;
import com.prestashop.tests.smoke_tests.Homepage;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected Actions actions;
    protected Homepage homepage;
    protected Faker faker;
    protected Random random;


    @BeforeMethod
    public void setupMethod(){

        driver=Driver.getDriver();
        softAssert=new SoftAssert();
        actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homepage=new Homepage();
        faker=new Faker();
        random=new Random();

    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
