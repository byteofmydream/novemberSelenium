package sfsdfsdfsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    private final By searchField = By.id("gh-ac");
    private final By searchButton = By.id("gh-btn");

    public HomePage enterSearchText(String text){
        driver.findElement(searchField).sendKeys(text);
        return this;
    }

    public HomePage clickSearchButton(){
        driver.findElement(searchButton).click();
        return this;
    }

    public HomePage openHomePage(){
        driver.get("http://www.ebay.com");
        return this;
    }

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

}
