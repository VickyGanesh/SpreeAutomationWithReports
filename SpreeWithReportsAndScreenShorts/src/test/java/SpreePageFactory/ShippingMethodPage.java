package SpreePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingMethodPage {
    WebDriver webDriver ;

    public ShippingMethodPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//*[@id='methods']/div/ul/li[1]/label/span[1]")
    WebElement shippingMethodTwo;

    @FindBy (css =  "input[data-disable-with='Save and Continue']")
    WebElement  btn_saveAndContinue;

    public void selectShippingMethod(){
        shippingMethodTwo.click();
        btn_saveAndContinue.click();

    }



}
