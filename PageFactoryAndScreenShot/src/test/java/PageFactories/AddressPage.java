package PageFactories;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {

    WebDriver webDriver;
    public AddressPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver , this);
    }

    @FindBy (css = "input[id='order_bill_address_attributes_firstname']")
    WebElement firstName;

    @FindBy (css = "input[id='order_bill_address_attributes_lastname']")
    WebElement lastName;

    @FindBy (css = "input[id='order_bill_address_attributes_address1']")
    WebElement address1;

    @FindBy (css = "input[id='order_bill_address_attributes_address2']")
    WebElement address2;

    @FindBy (css = "input[id='order_bill_address_attributes_city']")
    WebElement cityName;

    @FindBy (css = "input[id='order_bill_address_attributes_state_id']")
    WebElement state;

    @FindBy (css = "input[id='order_bill_address_attributes_zipcode']")
    WebElement zipCodeNumber;

   /* @FindAll({
            @FindBy (css = "select[id='order_bill_address_attributes_country_id']" ) ,
            @FindBy (css = "option[value='226']")
    })
    WebElement country;*/
    @FindBy (css = "select[id='order_bill_address_attributes_state_id']")
    WebElement country;


    @FindBy (css = "input[id='order_bill_address_attributes_phone']")
    WebElement phoneNumber;

    @FindBy (css = "input[data-disable-with='Save and Continue']")
    WebElement btn_saveAndContinue;

    WebDriverWait wait;
    wait = new WebDriverWait(webDriver , 5);

    TakesScreenshot takesScreenshot =(TakesScreenshot) webDriver;

    public void addBillingAddress(String fname , String lname , String add1 , String add2 ,
                                  String city, String zipCode, String phoneNum){
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        address1.sendKeys(add1);
        address2.sendKeys(add2);
        cityName.sendKeys(city);
        country.click();
        country.sendKeys("California");
        zipCodeNumber.sendKeys(zipCode);
        phoneNumber.sendKeys(phoneNum);
        btn_saveAndContinue.click();

    }

}
