package sfsdfsdfsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPO {
    protected WebDriver driver;

    public AbstractPO(WebDriver driver){
        this.driver = driver;
    }

    public void waitForEl(By by){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(by));
    }
}
