package com.prestashop.tests.smoke_tests;

import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

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
    @FindBy(xpath = "//span[@class='product-name']")
    public WebElement pdtNameAfter;
    @FindBy(xpath= "//span[@id='layer_cart_product_price']")
    public WebElement pdtPriceAfter;

    //WO-1: Positive Login Test   &&   WO-2: Negative Login TestWrong Username
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username1;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password1;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement login1;

    //WO-2: Negative Login TestWrong Username


//====================PRISTA SHOP TWO========================
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;
    @FindBy(id = "email_create")
    public WebElement newEmail;
    @FindBy(id = "email")
    public WebElement neEmail;
    @FindBy(id = "customer_firstname")
    public WebElement firstName;
    @FindBy(id="customer_lastname")
    public WebElement lastname;
    @FindBy(id="passwd")
    public WebElement passWrd;
    //address info

    @FindBy(id="address1")
    public WebElement addresss;
    @FindBy(id="city")
    public WebElement city;
    @FindBy(id="id_state")
    public WebElement state;

   // Select select=new Select(state);
    @FindBy(id = "postcode")
    public WebElement zipCode;
    @FindBy(id = "phone_mobile")
    public WebElement phoneNum;
    @FindBy(id="alias")
    public WebElement aliasAddres;
    @FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
    public WebElement registerButton;
    @FindBy(xpath = "(//div[@class='header_user_info'])[1]")
    public WebElement nameOnTopp;
    @FindBy(xpath = "//span[.='My personal information']")
    public WebElement clickOnpersonalInfo;
    @FindBy(id = "firstname")
    public WebElement secFirName;
    @FindBy(xpath = "//div[@class='required form-group'][2]/input")
    public WebElement secLastName;
    @FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
    public WebElement backToaccouButton;
    @FindBy(xpath = "(//input[@class='is_required validate form-control'])[3]")
    public WebElement emailConfiramtion;
    @FindBy(xpath = "//span[.='My addresses']")
    public WebElement clickOnAddress;
    @FindBy(xpath = "(//span[@class='address_name'])[1]")
    public WebElement addName;
    @FindBy(xpath = "(//span[@class='address_name'])[2]")
    public WebElement addlastName;
    @FindBy(xpath = "//span[@class='address_address1']")
    public WebElement streetAdd;
    @FindBy(xpath = "(//div[@class='col-xs-12 col-sm-6 address']/ul/li)[5]")
    public WebElement allAddress;
    @FindBy(xpath = "//a[@class='logout']")
   public WebElement signOut;
    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[2]")
    public WebElement loginUsingValidEmail;
    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[3]")
    public WebElement loginUsingValidPass;


    //===============Error MessageValidation: First name=====================
    @FindBy(xpath = "//div[@class='alert alert-danger']/ol")
    public WebElement firstNameRequiredErrorMege;

    //cart details
    public void open(){
        Driver.getDriver().get("http://automationpractice.com/index.php");

    }
    @FindBy(xpath = "//div[@class='button-container']/a")
    public WebElement proceedtocart;

    @FindBy(xpath = "//i[@class='icon-plus']")
    public WebElement addIcon;//(adding different quantity)

    @FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
    public WebElement selectingSize;

    @FindBy(xpath = "//span[.='Add to cart']")
    public WebElement addPdtToCart;
    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")
    public WebElement succesMessage;
    @FindBy(xpath = "//span[@class='cross']")
    public WebElement xbutton;
    @FindBy(xpath ="//img[@class='logo img-responsive']")
    public WebElement companyLogo;
    @FindBy(xpath = "(//div[@class='product-image-container'])[7]")
    public WebElement pdtOnSale;
@FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]")
public WebElement addIcon2;
    @FindBy(className = "fancybox-iframe")
    public WebElement ifram2;
   @FindBy(css = "button.exclusive")
    public WebElement addPdt2;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public WebElement hoverOverCart1;
    @FindBy(xpath = "(//span[@class='price'])[1]")
    public WebElement pricePdt1;
    @FindBy(xpath = "(//span[@class='price'])[2]")
    public WebElement pricePdt2;
    @FindBy(xpath = "//span[@class='price cart_block_total ajax_block_cart_total']")
    public WebElement totalPrice;
    @FindBy(xpath = "//div[@class='cart-prices-line first-line']/span[1]")
    public WebElement shippingPrice;


















}



