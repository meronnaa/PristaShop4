package com.prestashop.tests.smoke_tests;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//productInformation

    @FindBy(xpath = "//a[@class='login']")
    public WebElement login;
    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[2]")
    public WebElement emailaddress;
    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[3]")
    public WebElement password;
    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signin;
    @FindBy(xpath = "//span[@class='navigation_page']")
    public WebElement myAccount;
    @FindBy(xpath = "//span[.='My personal information']")
    public WebElement mypersonalInfo;
    @FindBy(xpath = "//span[.='Meron Tesfay']")
    public WebElement nameOnTop;
    @FindBy(id = "firstname")
    public WebElement firstname;
    @FindBy(id = "lastname")
    public WebElement lastName;
    @FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
    public WebElement errorMessage;
    @FindBy(xpath = "(//i[@class='icon-chevron-left'])[1]")
    public WebElement backToAccount;
    @FindBy(xpath = "//span[.='My addresses']")
    public WebElement myaddress;
    @FindBy(xpath = "//span[.='Add a new address']")
    public WebElement addNewAddres;
    @FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
    public WebElement clkSave;
    @FindBy(xpath = "(//div[@class='alert alert-danger']/ol/li)[1]")
    public WebElement errMessage;


    //pdtInfo_Price

    @FindBy(xpath = "(//div[@class='left-block'])[3]")
    public WebElement clkPdt;
    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]/div/div[2]/h5")
    public  WebElement prdName;
    @FindBy(css = "#bigpic")
    public WebElement prdName1;
    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    public WebElement iFram;
    @FindBy(xpath = "//span[@itemprop='price']")
    public WebElement itemPricebefore;
    @FindBy(xpath = "//span[@itemprop='price']")
    public WebElement itempriceAfter;
    @FindBy(id="quantity_wanted")
    public WebElement defaultQuantity;
    @FindBy(xpath = "//span[@style='width: 228px; user-select: none;']")
    public WebElement defaultSize;
    @FindBy(xpath = "//div[@class='selector']")
    public WebElement sizes;
    @FindBy(xpath = "//span[.='Add to cart']")
    public WebElement addpdt;
    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")
    public WebElement sucessMessage;
    @FindBy(xpath= "//span[@id='layer_cart_product_quantity']")
    public WebElement quantiyDefault;
    @FindBy(xpath = "//span[@id='layer_cart_product_attributes']")
    public WebElement sizeDefault;


    //WO-1: Positive Login Test   &&   WO-2: Negative Login TestWrong Username
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username1;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password1;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement login1;

    //WO-2: Negative Login TestWrong Username



}



