package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    WebDriver webDriver;

    public PaymentPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (css = "input[id='order_payments_attributes__payment_method_id_3']")
    WebElement checkOption;

    @FindBy (css = "input[data-disable-with='Save and Continue']")
    WebElement btn_saveAndContinue;

    public void makePayment(){
        checkOption.click();
        btn_saveAndContinue.click();
    }


}
