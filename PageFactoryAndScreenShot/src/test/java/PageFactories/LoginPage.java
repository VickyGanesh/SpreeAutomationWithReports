package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;
    @FindBy (css = "input[id='spree_user_email']")
    WebElement userEmailId;

    @FindBy (id = "spree_user_password")
    WebElement passWord;

    @FindBy (css = "input[data-disable-with=\"Login\"]")
    WebElement btn_login;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void login(String uname , String pswrd ){
        userEmailId.sendKeys(uname);
        passWord.sendKeys(pswrd);
        btn_login.click();
    }


}
