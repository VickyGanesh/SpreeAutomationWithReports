package SpreePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CartPage {
    WebDriver webDriver;

    public CartPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy (css = "button[id='add-to-cart-button']")
    WebElement btn_addToCart;

    @FindBy (css = "button[id='checkout-link']")
    WebElement bt_checkOut;

    public void addToCart(){
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        btn_addToCart.click();
        bt_checkOut.click();
    }
}
