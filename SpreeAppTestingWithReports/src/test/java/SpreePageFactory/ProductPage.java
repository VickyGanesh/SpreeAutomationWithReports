package SpreePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver webDriver ;

    public ProductPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy (css = "a[href='/logout']")
    WebElement logOutButton;

    public  void clickLogout(){
        logOutButton.click();
    }

    @FindBy (css = "a[href='/t/bags']")
    WebElement categoryBag;

    @FindBy (xpath = "//*[@id='product_1']/div/div[1]")
    WebElement firstProduct;

    public void selectProduct(){
        categoryBag.click();
        firstProduct.click();
    }
}
