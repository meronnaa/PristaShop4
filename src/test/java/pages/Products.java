package pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Products {
    public Products(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
