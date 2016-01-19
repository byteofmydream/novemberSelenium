package sfsdfsdfsd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPO{


    private final By searchField = By.id("gh-ac");
    private final By searchButton = By.id("gh-btn");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage enterSearchText(String text){
        driver.findElement(searchField).sendKeys(text);
        return this;
    }

    public HomePage clickSearchButton(){
        driver.findElement(searchButton).click();
        return this;
    }

    public HomePage openHomePage(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("");
        driver.get("http://www.ebay.com");

        return this;
    }


}
