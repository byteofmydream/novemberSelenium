package sfsdfsdfsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPO {

    public LoginPage(WebDriver driver){super(driver);}

    public boolean isLoginButtonVisible(){
        return driver.findElement(By.id("sgnBtn")).isDisplayed();
    }
}
